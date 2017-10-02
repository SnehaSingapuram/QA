using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

using OpenQA.Selenium;
using OpenQA.Selenium.Firefox;

namespace BasicTest
{
    
      [TestClass]
      public class Setup
      {
        [TestMethod]
        public void SetupDllTest()
        {


            IWebDriver driver = new FirefoxDriver();
            driver.Navigate().GoToUrl("www.google.com");
        }

      }
        
    
}
