# Simple-Java-Bsod

This Will Cause A SAFE bsod that doesnt destroy your pc but it does make unsaved files go brrrr

## to cause it all you have to is it put this:
```java
NtDll.INSTANCE.RtlAdjustPrivilege(19, true, false, new Memory(1));
NtDll.INSTANCE.NtRaiseHardError(0xDEADDEAD, 0, 0, 0, 6, new Memory(32));
```
 and include the <a href="https://github.com/INZO-Technologies/Simple-Java-Bsod/blob/main/NtDll.java">NtDll.java</a> obviously 

