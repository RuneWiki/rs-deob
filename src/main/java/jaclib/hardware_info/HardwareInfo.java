package jaclib.hardware_info;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/hardware_info/HardwareInfo")
public class HardwareInfo {

    @OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "getPackedBasicCPUInfo", descriptor = "()I")
    public static final native int getPackedBasicCPUInfo();
}
