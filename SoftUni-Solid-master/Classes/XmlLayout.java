package Classes;

import Enums.ReportLevel;
import Interfaces.Layout;

public class XmlLayout implements Layout {
    @Override
    public String format(String date, ReportLevel reportLevel, String message) {
        return String.format("<log>\r\n" +
                "   <date>%s</date>\r\n" +
                "   <level>%s</level>\r\n" +
                "   <message>%s</message>\r\n" +
                "</log>\r\n", date, reportLevel.toString(), message);
    }
}
