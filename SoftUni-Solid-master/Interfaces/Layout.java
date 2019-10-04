package Interfaces;

import Enums.ReportLevel;

public interface Layout {
    String format(String date, ReportLevel reportLevel, String message);
}
