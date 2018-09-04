package com.megster.cordova;

public class EV3LCPMessage {
    public static byte Array = (byte) -63;
    public static byte ArrayAppend = (byte) -60;
    public static byte ArrayRead = (byte) -61;
    public static byte ArrayWrite = (byte) -62;
    public static final byte BEGIN_DOWNLOAD = (byte) -110;
    public static final byte BEGIN_GETFILE = (byte) -106;
    public static final byte BEGIN_UPLOAD = (byte) -108;
    public static final byte BLUETOOTHPIN = (byte) -97;
    public static byte Background = (byte) 0;
    public static byte Backward = (byte) -1;
    public static byte Black = (byte) 0;
    public static final byte CLOSE_FILEHANDLE = (byte) -104;
    public static final byte CONTINUE_DOWNLOAD = (byte) -109;
    public static final byte CONTINUE_GETFILE = (byte) -105;
    public static final byte CONTINUE_LIST_FILES = (byte) -102;
    public static final byte CONTINUE_UPLOAD = (byte) -107;
    public static final byte CREATE_DIR = (byte) -101;
    public static final byte Color = (byte) 29;
    public static final byte DELETE_FILE = (byte) -100;
    public static byte DIRECT_COMMAND = (byte) 0;
    public static byte DIRECT_COMMAND_NOREPLY = Byte.MIN_VALUE;
    public static byte DIRECT_COMMAND_REPLY = (byte) 2;
    public static byte DIRECT_REPLY_ERROR = (byte) 4;
    public static final byte ENTERFWUPDATE = (byte) -96;
    public static final byte Empty = (byte) 126;
    public static byte File = (byte) -64;
    public static byte FileName = (byte) -58;
    public static byte Foreground = (byte) 1;
    public static byte Forward = (byte) 1;
    public static byte Green = (byte) 1;
    public static byte GreenFlash = (byte) 4;
    public static byte GreenPulse = (byte) 7;
    public static final byte Gyro = (byte) 32;
    public static final byte I2C = (byte) 100;
    public static final byte IR = (byte) 33;
    public static byte In1 = (byte) 0;
    public static byte In2 = (byte) 1;
    public static byte In3 = (byte) 2;
    public static byte In4 = (byte) 3;
    public static byte Info = (byte) 124;
    public static byte InitBytes = (byte) 47;
    public static byte Initializing = (byte) 125;
    public static byte InputDevice = LIST_FILES;
    public static byte InputDeviceList = CLOSE_FILEHANDLE;
    public static byte InputRead = CONTINUE_LIST_FILES;
    public static byte InputReadExt = WRITEMAILBOX;
    public static byte InputReadSI = LIST_OPEN_HANDLES;
    public static byte InputReady = DELETE_FILE;
    public static byte InputSample = CONTINUE_GETFILE;
    public static byte InputTest = CREATE_DIR;
    public static byte InputWrite = BLUETOOTHPIN;
    public static final byte LIST_FILES = (byte) -103;
    public static final byte LIST_OPEN_HANDLES = (byte) -99;
    public static final byte LMotor = (byte) 7;
    public static byte Large = (byte) 2;
    public static final byte MMotor = (byte) 8;
    public static byte MailboxClose = (byte) -35;
    public static byte MailboxOpen = (byte) -40;
    public static byte MailboxRead = (byte) -38;
    public static byte MailboxReady = (byte) -36;
    public static byte MailboxTest = (byte) -37;
    public static byte MailboxWrite = (byte) -39;
    public static byte Medium = (byte) 1;
    public static byte MemoryRead = Byte.MAX_VALUE;
    public static byte MemoryUsage = (byte) -59;
    public static byte MemoryWrite = Empty;
    public static byte NEW_LINE = (byte) 10;
    public static final byte NXTColor = (byte) 4;
    public static final byte NXTLight = (byte) 2;
    public static final byte NXTSound = (byte) 3;
    public static final byte NXTTemperature = (byte) 6;
    public static byte NXTTest = (byte) 101;
    public static final byte NXTTouch = (byte) 1;
    public static final byte NXTUltraSonic = (byte) 5;
    public static byte None = Empty;
    public static byte OUTPUT_POWER = (byte) -92;
    public static byte OUTPUT_SPEED = (byte) -91;
    public static byte OUTPUT_START = (byte) -90;
    public static byte OUTPUT_STOP = (byte) -93;
    public static byte OppositeDirection = (byte) 0;
    public static byte Orange = (byte) 3;
    public static byte OrangeFlash = (byte) 6;
    public static byte OrangePulse = (byte) 9;
    public static byte OutA = (byte) 1;
    public static byte OutAll = (byte) 15;
    public static byte OutB = (byte) 2;
    public static byte OutC = (byte) 4;
    public static byte OutD = (byte) 8;
    public static byte OutputClrCount = (byte) -78;
    public static byte OutputGetCount = (byte) -77;
    public static byte OutputGetType = ENTERFWUPDATE;
    public static byte OutputPolarity = (byte) -89;
    public static byte OutputPosition = (byte) -85;
    public static byte OutputRead = (byte) -88;
    public static byte OutputReady = (byte) -86;
    public static byte OutputReset = (byte) -94;
    public static byte OutputSetType = (byte) -95;
    public static byte OutputStepPower = (byte) -84;
    public static byte OutputStepSpeed = (byte) -82;
    public static byte OutputStepSync = (byte) -80;
    public static byte OutputTest = (byte) -87;
    public static byte OutputTimePower = (byte) -83;
    public static byte OutputTimeSpeed = (byte) -81;
    public static byte OutputTimeSync = (byte) -79;
    public static byte PLAY_TONE = BEGIN_UPLOAD;
    public static byte ProgramStart = (byte) 3;
    public static byte ProgramStop = (byte) 2;
    public static byte Red = (byte) 2;
    public static byte RedFlash = (byte) 5;
    public static byte RedPulse = (byte) 8;
    public static byte SYSTEM_COMMAND = (byte) 1;
    public static byte SYSTEM_COMMAND_NOREPLY = (byte) -127;
    public static byte SYSTEM_COMMAND_REPLY = (byte) 3;
    public static byte SYSTEM_REPLY_ERROR = (byte) 5;
    public static final byte SYS_CORRUPT_FILE = (byte) 3;
    public static final byte SYS_END_OF_FILE = (byte) 8;
    public static final byte SYS_FILE_EXITS = (byte) 7;
    public static final byte SYS_HANDLE_NOT_READY = (byte) 2;
    public static final byte SYS_ILLEGAL_CONNECTION = (byte) 12;
    public static final byte SYS_ILLEGAL_FILENAME = (byte) 11;
    public static final byte SYS_ILLEGAL_PATH = (byte) 6;
    public static final byte SYS_NO_HANDLES_AVAILABLE = (byte) 4;
    public static final byte SYS_NO_PERMISSION = (byte) 5;
    public static final byte SYS_SIZE_ERROR = (byte) 9;
    public static final byte SYS_SUCCESS = (byte) 0;
    public static final byte SYS_UNKNOWN_ERROR = (byte) 10;
    public static final byte SYS_UNKNOWN_HANDLE = (byte) 1;
    public static byte Small = (byte) 0;
    public static byte SoundReady = BEGIN_GETFILE;
    public static byte SoundTest = CONTINUE_UPLOAD;
    public static byte String_DEF = (byte) 125;
    public static byte Test = (byte) 21;
    public static byte TestCommand = (byte) -1;
    public static final byte Touch = (byte) 16;
    public static byte UIButton = (byte) -125;
    public static byte UIDraw = (byte) -124;
    public static byte UIRead = (byte) -127;
    public static byte UIWrite = (byte) -126;
    public static final byte Ultrasonic = (byte) 30;
    public static byte Unknown = (byte) -1;
    public static final byte WRITEMAILBOX = (byte) -98;
    public static byte WrongPort = Byte.MAX_VALUE;

    public static byte[] getBeepMessage(int frequency, int duration) {
        return new byte[]{(byte) 0, (byte) 0, DIRECT_COMMAND_NOREPLY, (byte) 0, (byte) 0, PLAY_TONE, (byte) 1, (byte) -127, (byte) 2, (byte) -126, (byte) frequency, (byte) (frequency >> 8), (byte) -126, (byte) duration, (byte) (duration >> 8)};
    }

    public static byte[] getMotorMessage(int motor, int speed) {
        if (speed == 0) {
            return new byte[]{(byte) 0, (byte) 0, DIRECT_COMMAND_NOREPLY, (byte) 0, (byte) 0, OUTPUT_STOP, (byte) 0, (byte) motor, (byte) 0};
        }
        return new byte[]{(byte) 0, (byte) 0, DIRECT_COMMAND_NOREPLY, (byte) 0, (byte) 0, OUTPUT_SPEED, (byte) 0, (byte) motor, (byte) -127, (byte) speed, OUTPUT_START, (byte) 0, (byte) motor};
    }

    public static byte[] getStartProgramMessage(String programName) {
        byte[] message = new byte[(programName.length() + 19)];
        message[0] = (byte) 0;
        message[1] = (byte) 0;
        message[2] = DIRECT_COMMAND_NOREPLY;
        message[3] = (byte) 8;
        message[4] = (byte) 0;
        message[5] = (byte) -64;
        message[6] = (byte) 8;
        message[7] = (byte) -126;
        message[8] = (byte) 1;
        message[9] = (byte) 0;
        message[10] = (byte) -124;
        for (int pos = 0; pos < programName.length(); pos++) {
            message[pos + 11] = (byte) programName.charAt(pos);
        }
        message[programName.length() + 11] = (byte) 0;
        message[programName.length() + 12] = (byte) 96;
        message[programName.length() + 13] = I2C;
        message[programName.length() + 14] = ProgramStart;
        message[programName.length() + 15] = (byte) 1;
        message[programName.length() + 16] = (byte) 96;
        message[programName.length() + 17] = I2C;
        message[programName.length() + 18] = (byte) 0;
        return message;
    }

    public static byte[] getStopProgramMessage() {
        return new byte[]{(byte) 0, (byte) 0, DIRECT_COMMAND_NOREPLY, (byte) 0, (byte) 0, ProgramStop, (byte) 1};
    }

    public static byte[] getDeviceListMessage() {
        return new byte[]{(byte) 0, (byte) 0, DIRECT_COMMAND, (byte) 5, (byte) 0, InputDeviceList, (byte) 4, (byte) 96, I2C};
    }

    public static byte[] getSensorValueMessage(byte portno, byte sensor_type) {
        return new byte[]{(byte) 0, (byte) 0, DIRECT_COMMAND, (byte) 1, (byte) 0, InputRead, (byte) 0, portno, (byte) 0, (byte) 0, (byte) 96};
    }

    public static byte[] getInputDeviceValue(byte portno, byte sensor_type) {
        return new byte[]{(byte) 0, (byte) 0, DIRECT_COMMAND, (byte) 1, (byte) 0, InputDevice, Color, (byte) 0, portno, (byte) 0, (byte) 0, (byte) 1, (byte) 96};
    }

    public static byte[] getFindFilesMessage(boolean findFirst, int handle, String searchString) {
        byte[] message;
        if (findFirst) {
            message = new byte[(searchString.length() + 7)];
        } else {
            message = new byte[7];
        }
        message[0] = (byte) 0;
        message[1] = (byte) 0;
        message[2] = SYSTEM_COMMAND;
        if (findFirst) {
            message[3] = LIST_FILES;
            message[4] = (byte) -10;
            message[5] = (byte) 3;
            for (int pos = 0; pos < searchString.length(); pos++) {
                message[pos + 6] = (byte) searchString.charAt(pos);
            }
            message[searchString.length() + 6] = (byte) 0;
        } else {
            message[3] = CONTINUE_LIST_FILES;
            message[4] = (byte) -10;
            message[5] = (byte) 3;
            message[6] = (byte) handle;
        }
        return message;
    }

    public static byte[] getDeleteMessage(String fileName) {
        byte[] message = new byte[(fileName.length() + 5)];
        message[0] = (byte) 0;
        message[1] = (byte) 0;
        message[2] = SYSTEM_COMMAND;
        message[3] = DELETE_FILE;
        for (int pos = 0; pos < fileName.length(); pos++) {
            message[pos + 4] = (byte) fileName.charAt(pos);
        }
        message[fileName.length() + 4] = (byte) 0;
        return message;
    }

    public static byte GetListFileHandle(byte[] message) {
        return message[9];
    }

    public static byte GetSystemReplyStatus(byte[] message) {
        return message[4];
    }

    public static byte CheckSystemReplyType(byte[] message) {
        if (message[3] >= BEGIN_DOWNLOAD || message[3] <= ENTERFWUPDATE) {
            return message[3];
        }
        return (byte) 10;
    }

    public static int GetFirstProjectName(byte[] message) {
        return 10;
    }

    public static int ProjectNameLength(int index, byte[] message) {
        if (index >= message.length - 1) {
            return -1;
        }
        int len = 0;
        while (message[len + index] != NEW_LINE && len + index < message.length - 1) {
            len++;
        }
        return len;
    }

    public static int GetFirstFileName(byte[] message) {
        if (message.length >= 43 && message[42] == Gyro && message.length >= 52 && message[51] == Gyro) {
            return 52;
        }
        return -1;
    }

    public static int FindNextFile(byte[] message, int index) {
        if (index + 32 <= message.length && message[index + 32] == Gyro && message[index + 41] == Gyro) {
            return index + 42;
        }
        return -1;
    }

    public static byte[] getOpenWriteMessage(String fileName, int fileLength) {
        byte[] message = new byte[(fileName.length() + 9)];
        message[0] = (byte) 0;
        message[1] = (byte) 0;
        message[2] = SYSTEM_COMMAND;
        message[3] = BEGIN_DOWNLOAD;
        message[4] = (byte) fileLength;
        message[5] = (byte) (fileLength >> 8);
        message[6] = (byte) (fileLength >> 16);
        message[7] = (byte) (fileLength >> 24);
        for (int pos = 0; pos < fileName.length(); pos++) {
            message[pos + 8] = (byte) fileName.charAt(pos);
        }
        message[fileName.length() + 8] = (byte) 0;
        return message;
    }

    public static byte[] getWriteMessage(byte handle, byte[] data, int dataLength) {
        byte[] message = new byte[(dataLength + 5)];
        message[0] = (byte) 0;
        message[1] = (byte) 0;
        message[2] = SYSTEM_COMMAND;
        message[3] = CONTINUE_DOWNLOAD;
        message[4] = handle;
        for (int pos = 0; pos < dataLength; pos++) {
            message[pos + 5] = data[pos];
        }
        return message;
    }

    public static byte[] getCloseMessage(byte handle) {
        byte[] message = new byte[9];
        message[0] = (byte) 0;
        message[1] = (byte) 0;
        message[2] = SYSTEM_COMMAND;
        message[3] = CLOSE_FILEHANDLE;
        message[4] = handle;
        return message;
    }

    public static boolean checkWriteMessageReply(byte[] message) {
        if (message.length != 6 || message[2] != SYSTEM_COMMAND_REPLY) {
            return false;
        }
        if ((message[3] == BEGIN_DOWNLOAD || message[3] == CONTINUE_DOWNLOAD) && message[4] == (byte) 0) {
            return true;
        }
        return false;
    }

    public static boolean ifFileExist(byte[] message) {
        if (message[4] == (byte) 7) {
            return true;
        }
        return false;
    }

    public static byte getWriteFileHandle(byte[] message) {
        return message[5];
    }
}
