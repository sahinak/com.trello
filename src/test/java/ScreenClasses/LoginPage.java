package ScreenClasses;

import base.Element;
import utils.AppData;

public class LoginPage extends AppData
{
	
	
	public class PasswordText extends Element
	{
		public PasswordText()
		{
			setElement(readAppData(this));
		}
	}
	public PasswordText passwordText = new PasswordText();
	
	public class LoginButton extends Element
	{
		public LoginButton()
		{
			setElement(readAppData(this));
		}
	}
	public LoginButton loginButton = new LoginButton();
	
	public class LoginSubmitButton extends Element
	{
		public LoginSubmitButton()
		{
			setElement(readAppData(this));
		}
	}
	public LoginSubmitButton LoginSubmitButton = new LoginSubmitButton();



	public class UserNameTextIO extends Element
	{
		public UserNameTextIO()
		{
			setElement(readAppData(this));
		}
	}
	public UserNameTextIO userNameTextIO = new UserNameTextIO();
	
	public class Board extends Element
	{
		public Board()
		{
			setElement(readAppData(this));
		}
	}
	public Board board = new Board();
	
	public class AddACard extends Element
	{
		public AddACard()
		{
			setElement(readAppData(this));
		}
	}
	public AddACard addacard = new AddACard();


	public class GiveName extends Element
	{
		public GiveName()
		{
			setElement(readAppData(this));
		}
	}
	public GiveName givename = new GiveName();

	public class SaveCard extends Element
	{
		public SaveCard()
		{
			setElement(readAppData(this));
		}
	}
	public SaveCard savecard = new SaveCard();

	public class CardPresent extends Element
	{
		public CardPresent()
		{
			setElement(readAppData(this));
		}
	}
	public CardPresent cardpresent= new CardPresent();




}
