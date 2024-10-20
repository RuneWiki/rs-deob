package deob;

@ObfuscatedName("hw")
public class class211 extends class195 {

    @ObfuscatedName("hw.i")
    public final int field2603;

    @ObfuscatedName("hw.c")
    public final int field2602;

    @ObfuscatedName("hw.e")
    public final int[] field2606;

    @ObfuscatedName("hw.v")
    public final int[] field2604;

    public class211(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2603 = arg0;
        this.field2602 = arg1;
        this.field2606 = arg2;
        this.field2604 = arg3;
    }

    @ObfuscatedName("hw.i(III)Z")
    public boolean method3572(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2604.length) {
            int var3 = this.field2604[arg1];
            if (arg0 >= var3 && arg0 <= this.field2606[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
