using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using OpenQA.Selenium;
using OpenQA.Selenium.IE;


namespace Selenium_FirstProjec
{
    class Program
    {
        static void Main(string[] args)
        {
            IWebDriver webDriver = new InternetExplorerDriver();
            webDriver.Navigate().GoToUrl("www.google.com");


        }
    }
}
