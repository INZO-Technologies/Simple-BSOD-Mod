# Simple-BSOD-Mod
Simple way of causing a bsod using the native api implemented into a 1.12.2 Forge mod. Dowload It  <a href="https://github.com/INZO-Technologies/Simple-BSOD-Mod/releases/tag/v1.0">HERE</a>

To make your own you can go to [Main-Files](https://github.com/INZO-Technologies/Simple-BSOD-Mod/tree/Base-Files)



## What Causes This?:
```java
NtDll.INSTANCE.RtlAdjustPrivilege(19, true, false, new Memory(1));
NtDll.INSTANCE.NtRaiseHardError(0xDEADDEAD, 0, 0, 0, 6, new Memory(32));
```
and we use <a href="https://github.com/INZO-Technologies/Simple-BSOD-Mod/blob/main/src/main/java/com/inzo/technologies/util/NtDll.java">NtDll.java</a> to 1) Enable a privilege from the calling thread or process. 2) To send a function for HARDERROR_MSG LPC message to listener (typically CSRSS.EXE). This is very simple in the way it works.

## How does it work? 
The mod uses undocumented [Native API](https://en.wikipedia.org/wiki/Native_API) methods to raise an error in a critical system process and instructs the system to shutdown on said error, meaning blue screen. It does not damage your system to create the blue screen.
That being said,
#### SAVE ANY UNSAVED WORK ON YOUR COMPUTER BEFORE PLAYING WITH THIS MOD.

## I blue screen'd when I shouldn't have!
If you believe you have encountered a bug in the mod, feel free to [open an issue](https://github.com/INZO-Technologies/Simple-BSOD-Mod/issues/new/choose). Try to be as descriptive about it as possible. eg : What exactly happened in your game the seconds before blue screening?
What Apps Did you have open?

## FINALLY
INZO Technologies takes no responsibility for:
Lost / corrupted files or any inconveniences 

you have been warned use this mod at your own risk
