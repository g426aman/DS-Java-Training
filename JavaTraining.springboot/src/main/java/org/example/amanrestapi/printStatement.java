package org.example.amanrestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class printStatement {
   // create print name rest api
    @GetMapping(value ="/printName")
    public String printName()



        {

            return "My name is Aman Singh";


        }

        //create portfolio api
    @GetMapping(value="/portfolio")
    public String portfolio()
    {

            String portfolio=" <!--Header(start)-->\n" +
                    "    <table id=\"header\" border=\"0\" \n" +
                    "           width=\"100%\" cellpadding=\"0\" \n" +
                    "           cellspacing=\"0\" bgcolor=\"#4CAF50\">\n" +
                    "        <tr>\n" +
                    "            <td>\n" +
                    "                <table border=\"0\" cellpadding=\"15\" \n" +
                    "                       cellspacing=\"0\" width=\"90%\" \n" +
                    "                       align=\"center\">\n" +
                    "                    <tr>\n" +
                    "                        <td>\n" +
                    "                            &nbsp;\n" +
                    "\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            <font face=\"Comic sans MS\" size=\"6\">\n" +
                    "                                <b>Aman For Aman</b>\n" +
                    "                            </font>\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td width=\"15%\">\n" +
                    "                            &nbsp;\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            <a href=\"#home\" \n" +
                    "                               style=\"text-decoration:none\">\n" +
                    "                                <font face=\"Verdana\" \n" +
                    "                                      size=\"5\" color=black>\n" +
                    "                                    Home\n" +
                    "                                </font>\n" +
                    "                            </a>\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            |\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            <a href=\"#about\" \n" +
                    "                               style=\"text-decoration:none\">\n" +
                    "                                <font face=\"Verdana\" \n" +
                    "                                      size=\"5\" color=black>\n" +
                    "                                    About\n" +
                    "                                </font>\n" +
                    "                            </a>\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            |\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            <a href=\"#projects\" \n" +
                    "                               style=\"text-decoration:none\">\n" +
                    "                                <font face=\"Verdana\" \n" +
                    "                                      size=\"5\" color=black>\n" +
                    "                                    Projects\n" +
                    "                                </font>\n" +
                    "                            </a>\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            |\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            <a href=\"#achievements\" \n" +
                    "                               style=\"text-decoration:none\">\n" +
                    "                                <font face=\"Verdana\" \n" +
                    "                                      size=\"5\" color=black>\n" +
                    "                                    Achievements\n" +
                    "                                </font>\n" +
                    "                            </a>\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            |\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            <a href=\"#contact\" \n" +
                    "                               style=\"text-decoration:none\">\n" +
                    "                                <font face=\"Verdana\" \n" +
                    "                                      size=\"5\" color=black>\n" +
                    "                                    Contact\n" +
                    "                                </font>\n" +
                    "                            </a>\n" +
                    "                        </td>\n" +
                    "                    </tr>\n" +
                    "                </table>\n" +
                    "            </td>\n" +
                    "        </tr>\n" +
                    "    </table>\n" +
                    "    <!--Header(end)-->\n" +
                    "\n" +
                    "    <!--Home(start)-->\n" +
                    "    <table id=\"home\" border=\"1\" width=\"100%\" \n" +
                    "        cellpadding=\"20\" cellspacing=\"0\" bgcolor=\"black\">\n" +
                    "        <tr>\n" +
                    "            <td>\n" +
                    "                <table border=\"0\" cellpadding=\"15\" \n" +
                    "                    cellspacing=\"0\" width=\"90%\" align=\"center\">\n" +
                    "                    <tr>\n" +
                    "                        <td align=\"center\" valign=\"middle\">\n" +
                    "                            <h3>\n" +
                    "                                <font face=\"Times New Roman\" \n" +
                    "                                    size=\"6\" color=\"#ffffff\">\n" +
                    "                                    Hi Geeks!\n" +
                    "                                </font>\n" +
                    "                            </h3>\n" +
                    "\n" +
                    "                            <h2>\n" +
                    "                                <font face=\"Verdana\" size=\"6\"\n" +
                    "                                    color=\"#4CAF50\">\n" +
                    "                                    <!-- Freelance Programmer -->\n" +
                    "                                </font>\n" +
                    "                            </h2>\n" +
                    "                        </td>\n" +
                    "                    </tr>\n" +
                    "                </table>\n" +
                    "            </td>\n" +
                    "        </tr>\n" +
                    "    </table>\n" +
                    "    <!--Home(end)-->\n" +
                    "\n" +
                    "\n" +
                    "    <!--About(start)-->\n" +
                    "    <table id=\"about\" border=\"0\" width=\"100%\" \n" +
                    "        cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"black\">\n" +
                    "        <tr>\n" +
                    "            <td>\n" +
                    "                <table border=\"0\" cellpadding=\"15\" \n" +
                    "                    cellspacing=\"0\" width=\"80%\" align=\"center\">\n" +
                    "                    <tr>\n" +
                    "                        <td height=\"180\" align=\"center\" \n" +
                    "                            valign=\"middle\" colspan=\"2\">\n" +
                    "                            <font face=\"Verdana\" size=\"7\" \n" +
                    "                                color=\"#4CAF50\">\n" +
                    "                                About Me\n" +
                    "                            </font>\n" +
                    "                            <hr color=\"#4CAF50\" width=\"90\">\n" +
                    "                        </td>\n" +
                    "                    </tr>\n" +
                    "\n" +
                    "                    <tr>\n" +
                    "                        <td width=\"40%\">\n" +
                    "                            <img src=\"img.png\">\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td width=\"60%\">\n" +
                    "                            <font face=\"Verdana\" size=\"4\" \n" +
                    "                                color=\"white\">\n" +
                    "                                Thanks for your interest, here \n" +
                    "                                is a quick story of me and this \n" +
                    "                                website.\n" +
                    "                                <hr color=\"black\">\n" +
                    "                                Sandeep Jain An IIT Roorkee alumnus \n" +
                    "                                and founder of GeeksforGeeks. He \n" +
                    "                                loves to solve programming problems \n" +
                    "                                in most efficient ways. Apart from \n" +
                    "                                GeeksforGeeks, he has worked with \n" +
                    "                                DE Shaw and Co. as a software \n" +
                    "                                developer and JIIT Noida as an \n" +
                    "                                assistant professor.\n" +
                    "                                <hr color=\"black\">\n" +
                    "\n" +
                    "                                I do my work mainly in C-Language, \n" +
                    "                                C++ and JAVA. C++ and Data Structure\n" +
                    "                                and Algorithm are my stronger section.\n" +
                    "                                Besides these I know Web Development,\n" +
                    "                                LINUX and database as well.\n" +
                    "                                <hr color=\"black\">\n" +
                    "\n" +
                    "                                This website is basically one of my \n" +
                    "                                Web Development project which is \n" +
                    "                                built using HTML only.\n" +
                    "                                Here one can also find ideas for \n" +
                    "                                projects in different languages.\n" +
                    "\n" +
                    "                                Thanks again for reading this, \n" +
                    "                                because of people like you, it \n" +
                    "                                exists and prospers!\n" +
                    "                                <hr color=\"black\">\n" +
                    "                                Cheers,\n" +
                    "                                <br>\n" +
                    "                                <b>GeeksForGeeks.</b>\n" +
                    "                            </font>\n" +
                    "                        </td>\n" +
                    "                    </tr>\n" +
                    "                </table>\n" +
                    "                <hr color=\"black\">\n" +
                    "                <hr color=\"black\">\n" +
                    "                <hr color=\"black\">\n" +
                    "            </td>\n" +
                    "        </tr>\n" +
                    "    </table>\n" +
                    "    <!--About(end)-->\n" +
                    "\n" +
                    "\n" +
                    "    <!--Projects(start)-->\n" +
                    "    <table id=\"projects\" border=\"0\" width=\"100%\" \n" +
                    "        cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#c2c0c3\">\n" +
                    "        <tr>\n" +
                    "            <td>\n" +
                    "                <table border=\"0\" cellpadding=\"15\" \n" +
                    "                    cellspacing=\"0\" width=\"80%\" align=\"center\">\n" +
                    "                    <tr>\n" +
                    "                        <td height=\"180\" align=\"center\" \n" +
                    "                            valign=\"middle\" colspan=\"2\">\n" +
                    "                            <font face=\"Verdana\" size=\"7\" \n" +
                    "                                color=\"black\">\n" +
                    "                                Projects\n" +
                    "                            </font>\n" +
                    "                            <hr color=\"black\" width=\"90\">\n" +
                    "                        </td>\n" +
                    "                    </tr>\n" +
                    "\n" +
                    "                    <tr>\n" +
                    "                        <td height=\"10\">\n" +
                    "                            <font face=\"Times New Roman\" \n" +
                    "                                size=\"5\" color=\"black\">\n" +
                    "                                <ul>\n" +
                    "                                    <li>\n" +
                    "                                        BMI Calculator\n" +
                    "                                        <a href=\"#\" \n" +
                    "                                           style=\"text-decoration:none\">\n" +
                    "                                            &nbsp; ➲\n" +
                    "                                        </a>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                    <li>\n" +
                    "                                        <hr color=\"#c2c0c3\">\n" +
                    "                                        Calculator\n" +
                    "                                        <a href=\"#\" \n" +
                    "                                           style=\"text-decoration:none\"\n" +
                    "                                            color=\"#c2c0c3\">\n" +
                    "                                            &nbsp; ➲\n" +
                    "                                        </a>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                    <li>\n" +
                    "                                        <hr color=\"#c2c0c3\">\n" +
                    "                                        Calendar\n" +
                    "                                        <a href=\"#\" \n" +
                    "                                           style=\"text-decoration:none\">\n" +
                    "                                            &nbsp; ➲\n" +
                    "                                        </a>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                    <li>\n" +
                    "                                        <hr color=\"#c2c0c3\">\n" +
                    "                                        ChatBot\n" +
                    "                                        <a href=\"#\" \n" +
                    "                                           style=\"text-decoration:none\">\n" +
                    "                                            &nbsp; ➲\n" +
                    "                                        </a>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                    <li>\n" +
                    "                                        <hr color=\"#c2c0c3\">\n" +
                    "                                        Contact Saver\n" +
                    "                                        <a href=\"#\" \n" +
                    "                                           style=\"text-decoration:none\">\n" +
                    "                                            &nbsp; ➲\n" +
                    "                                        </a>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                    <li>\n" +
                    "                                        <hr color=\"#c2c0c3\">\n" +
                    "                                        Daily Quiz\n" +
                    "                                        <a href=\"#\" \n" +
                    "                                           style=\"text-decoration:none\">\n" +
                    "                                            &nbsp; ➲\n" +
                    "                                        </a>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                    <li>\n" +
                    "                                        <hr color=\"#c2c0c3\">\n" +
                    "                                        Emplyoyee Record System\n" +
                    "                                        <a href=\"#\" \n" +
                    "                                           style=\"text-decoration:none\">\n" +
                    "                                            &nbsp; ➲\n" +
                    "                                        </a>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                    <li>\n" +
                    "                                        <hr color=\"#c2c0c3\">\n" +
                    "                                        Guess the Number-Game\n" +
                    "                                        <a href=\"#\" \n" +
                    "                                           style=\"text-decoration:none\">\n" +
                    "                                            &nbsp; ➲\n" +
                    "                                        </a>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                    <li>\n" +
                    "                                        <hr color=\"#c2c0c3\">\n" +
                    "                                        Random Password Generator\n" +
                    "                                        <a href=\"#\" \n" +
                    "                                           style=\"text-decoration:none\">\n" +
                    "                                            &nbsp;➲\n" +
                    "                                        </a>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                    <li>\n" +
                    "                                        <hr color=\"#c2c0c3\">\n" +
                    "                                        Stone Paper Scissor\n" +
                    "                                        <a href=\"#\" \n" +
                    "                                           style=\"text-decoration:none\">\n" +
                    "                                            &nbsp;➲\n" +
                    "                                        </a>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                    <li>\n" +
                    "                                        <hr color=\"#c2c0c3\">\n" +
                    "                                        Tic Tac Toe\n" +
                    "                                        <a href=\"#\" \n" +
                    "                                           style=\"text-decoration:none\">\n" +
                    "                                            &nbsp;➲\n" +
                    "                                        </a>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                    <li>\n" +
                    "                                        <hr color=\"#c2c0c3\">\n" +
                    "                                        Tic Tac Toe(GUI)\n" +
                    "                                        <a href=\"#\" \n" +
                    "                                           style=\"text-decoration:none\">\n" +
                    "                                            &nbsp;➲\n" +
                    "                                        </a>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                    <li>\n" +
                    "                                        <hr color=\"#c2c0c3\">\n" +
                    "                                        ToDo App\n" +
                    "                                        <a href=\"#\" \n" +
                    "                                           style=\"text-decoration:none\">\n" +
                    "                                            &nbsp;➲ </a>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                    <li>\n" +
                    "                                        <hr color=\"#c2c0c3\">\n" +
                    "                                        Travel Management System\n" +
                    "                                        <a href=\"#\" style=\n" +
                    "                                            \"text-decoration:none\">&nbsp; ➲\n" +
                    "                                        </a>\n" +
                    "                                    </li>\n" +
                    "                                </ul>\n" +
                    "                                <hr color=\"#c2c0c3\">\n" +
                    "                                <hr color=\"#c2c0c3\">\n" +
                    "                                <hr color=\"#c2c0c3\">\n" +
                    "                                <hr color=\"#c2c0c3\">\n" +
                    "                            </font>\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td width=\"45%\">\n" +
                    "                            <img src=\"img.png\" \n" +
                    "                                 alt=\"Project\" width=\"75%\">\n" +
                    "                        </td>\n" +
                    "                    </tr>\n" +
                    "                </table>\n" +
                    "            </td>\n" +
                    "        </tr>\n" +
                    "    </table>\n" +
                    "    <!--Projects(end)-->\n" +
                    "\n" +
                    "    <!--Achievement(start)-->\n" +
                    "    <table id=\"achievements\" border=\"0\" width=\"100%\" \n" +
                    "        cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"black\">\n" +
                    "        <tr>\n" +
                    "            <td>\n" +
                    "                <table border=\"0\" cellpadding=\"15\" \n" +
                    "                    cellspacing=\"0\" width=\"80%\" align=\"center\">\n" +
                    "                    <tr>\n" +
                    "                        <td height=\"180\" align=\"center\" valign=\"middle\">\n" +
                    "                            <font face=\"Verdana\" size=\"7\" color=\"#4CAF50\">\n" +
                    "                                Achievements\n" +
                    "                                <hr color=\"#4CAF50\" width=\"100\">\n" +
                    "                            </font>\n" +
                    "                        </td>\n" +
                    "                    </tr>\n" +
                    "\n" +
                    "                    <tr>\n" +
                    "                        <td>\n" +
                    "                            <font face=\"Verdana\" size=\"4\" color=\"white\">\n" +
                    "                                <ul>\n" +
                    "                                    <li>\n" +
                    "                                        <b>Intern at GeeksforGeeks.</b>\n" +
                    "                                        <ul>\n" +
                    "                                            <li>\n" +
                    "                                                December,2020 - Present.\n" +
                    "                                            </li>\n" +
                    "                                            <li>\n" +
                    "                                                Write technical articles \n" +
                    "                                                on programming related topics.\n" +
                    "                                            </li>\n" +
                    "                                        </ul>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                    <li>\n" +
                    "                                        <hr color=\"black\">\n" +
                    "                                        <hr color=\"black\">\n" +
                    "                                        <hr color=\"black\">\n" +
                    "                                        <b>Microsoft Learn Student Ambassador.</b>\n" +
                    "                                        <ul>\n" +
                    "                                            <li>\n" +
                    "                                                August,2020 - Present.\n" +
                    "                                            </li>\n" +
                    "                                            <li>\n" +
                    "                                                Conducted events and workshops on\n" +
                    "                                                different technologies.\n" +
                    "                                            </li>\n" +
                    "                                        </ul>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                    <li>\n" +
                    "                                        <hr color=\"black\">\n" +
                    "                                        <hr color=\"black\">\n" +
                    "                                        <hr color=\"black\">\n" +
                    "                                        <b>Mentored HackTX.</b>\n" +
                    "                                        <ul>\n" +
                    "                                            <li>\n" +
                    "                                                October,2020.\n" +
                    "                                            </li>\n" +
                    "                                            <li>\n" +
                    "                                                Selected from Microsoft as Student\n" +
                    "                                                ambassador where I mentored students\n" +
                    "                                                in their projects.\n" +
                    "                                            </li>\n" +
                    "                                            <hr color=\"black\">\n" +
                    "                                            <hr color=\"black\">\n" +
                    "                                            <hr color=\"black\">\n" +
                    "                                            <hr color=\"black\">\n" +
                    "                                            <hr color=\"black\">\n" +
                    "                                        </ul>\n" +
                    "                                    </li>\n" +
                    "\n" +
                    "                                </ul>\n" +
                    "\n" +
                    "                            </font>\n" +
                    "                        </td>\n" +
                    "                    </tr>\n" +
                    "                </table>\n" +
                    "            </td>\n" +
                    "        </tr>\n" +
                    "    </table>\n" +
                    "    <!--Achievement(end)-->\n" +
                    "\n" +
                    "\n" +
                    "    <!--Contact(start)-->\n" +
                    "    <table id=\"contact\" border=\"0\" width=\"100%\" \n" +
                    "        cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#c2c0c3\">\n" +
                    "        <tr>\n" +
                    "            <td>\n" +
                    "                <table border=\"0\" cellpadding=\"15\" \n" +
                    "                    cellspacing=\"0\" width=\"80%\" align=\"center\">\n" +
                    "                    <tr>\n" +
                    "                        <td height=\"180\" align=\"center\" \n" +
                    "                            valign=\"middle\" colspan=\"2\">\n" +
                    "                            <font face=\"Verdana\" size=\"7\" \n" +
                    "                                color=\"black\">\n" +
                    "                                Contact\n" +
                    "                            </font>\n" +
                    "                            <hr color=\"black\" width=\"90\">\n" +
                    "                        </td>\n" +
                    "                    </tr>\n" +
                    "\n" +
                    "                    <tr>\n" +
                    "                        <td align=\"center\" valign=\"top\">\n" +
                    "                            <table border=\"0\" width=\"50%\" cellpadding=\"15\" \n" +
                    "                                cellspacing=\"0\" align=\"center\" bgcolor=\"black\">\n" +
                    "                                <tr>\n" +
                    "                                    <td width=\"30%\">\n" +
                    "                                        <hr color=\"black\">\n" +
                    "                                        <font face=\"Verdana\" size=\"4\" \n" +
                    "                                            color=\"#ffffff\">\n" +
                    "                                            Name\n" +
                    "                                        </font>\n" +
                    "                                    </td>\n" +
                    "                                    <td width=\"70%\">\n" +
                    "                                        <font face=\"Verdana\" size=\"4\" \n" +
                    "                                            color=\"#ffffff\">\n" +
                    "                                            <input type=\"text\" size=\"40\">\n" +
                    "                                        </font>\n" +
                    "                                    </td>\n" +
                    "                                </tr>\n" +
                    "                                <tr>\n" +
                    "                                    <td width=\"30%\">\n" +
                    "                                        <font face=\"Verdana\" size=\"4\" \n" +
                    "                                            color=\"#ffffff\">\n" +
                    "                                            Email\n" +
                    "                                        </font>\n" +
                    "                                    </td>\n" +
                    "                                    <td width=\"70%\">\n" +
                    "                                        <font face=\"Verdana\" size=\"4\" \n" +
                    "                                            color=\"#ffffff\">\n" +
                    "                                            <input type=\"email\" size=\"40\">\n" +
                    "                                        </font>\n" +
                    "                                    </td>\n" +
                    "                                </tr>\n" +
                    "                                <tr>\n" +
                    "                                    <td width=\"30%\">\n" +
                    "                                        <font face=\"Verdana\" size=\"4\" \n" +
                    "                                            color=\"#ffffff\">\n" +
                    "                                            Number\n" +
                    "                                        </font>\n" +
                    "                                    </td>\n" +
                    "                                    <td width=\"70%\">\n" +
                    "                                        <font face=\"Verdana\" size=\"4\" \n" +
                    "                                            color=\"#ffffff\">\n" +
                    "                                            <input type=\"number\" size=\"12\">\n" +
                    "                                        </font>\n" +
                    "                                    </td>\n" +
                    "                                </tr>\n" +
                    "                                <tr>\n" +
                    "                                    <td width=\"30%\">\n" +
                    "                                        <font face=\"Verdana\" size=\"4\" \n" +
                    "                                            color=\"#ffffff\">\n" +
                    "                                            Message\n" +
                    "                                        </font>\n" +
                    "                                    </td>\n" +
                    "                                    <td width=\"70%\">\n" +
                    "                                        <font face=\"Verdana\" size=\"4\" \n" +
                    "                                            color=\"#ffffff\">\n" +
                    "                                            <textarea rows=\"5\" \n" +
                    "                                                cols=\"37\">\n" +
                    "                                            </textarea>\n" +
                    "                                        </font>\n" +
                    "                                    </td>\n" +
                    "                                </tr>\n" +
                    "                                <tr>\n" +
                    "                                    <td width=\"30%\">\n" +
                    "                                        &nbsp;\n" +
                    "                                    </td>\n" +
                    "                                    <td width=\"70%\">\n" +
                    "                                        <button type=\"Submit\">\n" +
                    "                                            <font face=\"Verdana\" \n" +
                    "                                                size=\"4\" color=\"black\">\n" +
                    "                                                <b>Submit</b>\n" +
                    "                                            </font>\n" +
                    "                                        </button>\n" +
                    "                                        <hr color=\"black\">\n" +
                    "                                        <hr color=\"black\">\n" +
                    "                                    </td>\n" +
                    "                                </tr>\n" +
                    "                            </table>\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                    </tr>\n" +
                    "                    <tr>\n" +
                    "                        <td colspan=\"2\">\n" +
                    "                            &nbsp;\n" +
                    "                            &nbsp;\n" +
                    "                        </td>\n" +
                    "                    </tr>\n" +
                    "                </table>\n" +
                    "            </td>\n" +
                    "        </tr>\n" +
                    "    </table>\n" +
                    "    <!--Contact(end)-->\n" +
                    "\n" +
                    "\n" +
                    "    <!--Footer1(start)-->\n" +
                    "    <table id=\"footer\" border=\"0\" width=\"100%\" \n" +
                    "        cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#4CAF50\">\n" +
                    "        <tr>\n" +
                    "            <td>\n" +
                    "                <table border=\"0\" cellpadding=\"15\" \n" +
                    "                    cellspacing=\"0\" width=\"90%\" align=\"center\">\n" +
                    "                    <tr>\n" +
                    "                        <td width=\"13%\" valign=\"top\">\n" +
                    "                            <b>LinkedIn</b>\n" +
                    "                            <a href=\"#\" style=\"text-decoration:none\">\n" +
                    "                                ➲\n" +
                    "                            </a>\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            |\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td width=\"13%\" valign=\"top\">\n" +
                    "                            <b>GitHub</b>\n" +
                    "                            <a href=\"#\" style=\"text-decoration:none\">\n" +
                    "                                ➲ \n" +
                    "                            </a>\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            |\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td width=\"13%\" valign=\"top\">\n" +
                    "                            <b>HackerRank</b>\n" +
                    "                            <a href=\"#\" style=\"text-decoration:none\">\n" +
                    "                                ➲\n" +
                    "                            </a>\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            |\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td width=\"13%\" valign=\"top\">\n" +
                    "                            <b>GeeksforGeeks</b>\n" +
                    "                            <a href=\"#\" style=\"text-decoration:none\">\n" +
                    "                                ➲\n" +
                    "                            </a>\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            |\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td width=\"13%\" valign=\"top\">\n" +
                    "                            <b>Twitter</b>\n" +
                    "                            <a href=\"#\" style=\"text-decoration:none\">\n" +
                    "                                ➲\n" +
                    "                            </a>\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            |\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td width=\"13%\" valign=\"top\">\n" +
                    "                            <b>Instagram</b>\n" +
                    "                            <a href=\"#\" style=\"text-decoration:none\">\n" +
                    "                                ➲\n" +
                    "                            </a>\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            |\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td width=\"13%\" valign=\"top\">\n" +
                    "                            <b>Email</b>\n" +
                    "                            <a href=\"#\" style=\"text-decoration:none\">\n" +
                    "                                ➲\n" +
                    "                            </a>\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td>\n" +
                    "                            |\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td width=\"13%\" valign=\"top\">\n" +
                    "                            <b>Website</b>\n" +
                    "                            <a href=\"#\" style=\"text-decoration:none\">\n" +
                    "                                ➲\n" +
                    "                            </a>\n" +
                    "                        </td>\n" +
                    "                    </tr>\n" +
                    "                </table>\n" +
                    "            </td>\n" +
                    "        </tr>\n" +
                    "    </table>\n" +
                    "    <!--Footer1(end)-->\n" +
                    "\n" +
                    "\n" +
                    "    <!--Footer2(start)-->\n" +
                    "    <table id=\"footer\" border=\"0\" width=\"100%\" \n" +
                    "        cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"black\">\n" +
                    "        <tr>\n" +
                    "            <td>\n" +
                    "                <table border=\"0\" cellpadding=\"15\" \n" +
                    "                    cellspacing=\"0\" width=\"90%\" align=\"center\">\n" +
                    "                    <tr>\n" +
                    "                        <td width=\"80%\" valign=\"top\">\n" +
                    "                            <font face=\"Verdana\" \n" +
                    "                                color=\"#4CAF50\" size=\"5\">\n" +
                    "                                ©Copyright 2050 by nobody. \n" +
                    "                                All rights reserved.\n" +
                    "                            </font>\n" +
                    "                        </td>\n" +
                    "\n" +
                    "                        <td width=\"10%\">\n" +
                    "                            <font face=\"arial\" color=\"black\" size=\"5\">\n" +
                    "                                <a href=\"#header\" style=\"text-decoration:none\">\n" +
                    "                                    <font face=\"Verdana\" color=\"#4CAF50\" size=\"6\">\n" +
                    "                                        <b>TOP&nbsp;☝</b>\n" +
                    "                                    </font>\n" +
                    "                                </a>\n" +
                    "                            </font>\n" +
                    "                        </td>\n" +
                    "                    </tr>\n" +
                    "                </table>\n" +
                    "            </td>\n" +
                    "        </tr>\n" +
                    "    </table>\n";

        return "Aman Singh Portfolio <br>"+portfolio ;
    }














    }





