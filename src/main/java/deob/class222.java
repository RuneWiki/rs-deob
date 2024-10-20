package deob;

@ObfuscatedName("hw")
public class class222 extends class206 {

    @ObfuscatedName("hw.n")
    public final int field2722;

    @ObfuscatedName("hw.v")
    public final int field2719;

    @ObfuscatedName("hw.y")
    public final int[] field2720;

    @ObfuscatedName("hw.r")
    public final int[] field2721;

    public class222(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2722 = arg0;
        this.field2719 = arg1;
        this.field2720 = arg2;
        this.field2721 = arg3;
    }

    @ObfuscatedName("hw.n(III)Z")
    public boolean method3767(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2721.length) {
            int var3 = this.field2721[arg1];
            if (arg0 >= var3 && arg0 <= this.field2720[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
