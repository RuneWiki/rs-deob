package deob;

@ObfuscatedName("hq")
public class class231 extends class215 {

    @ObfuscatedName("hq.b")
    public final int field2733;

    @ObfuscatedName("hq.q")
    public final int field2731;

    @ObfuscatedName("hq.o")
    public final int[] field2732;

    @ObfuscatedName("hq.p")
    public final int[] field2734;

    public class231(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2733 = arg0;
        this.field2731 = arg1;
        this.field2732 = arg2;
        this.field2734 = arg3;
    }

    @ObfuscatedName("hq.b(III)Z")
    public boolean method4014(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2734.length) {
            int var3 = this.field2734[arg1];
            if (arg0 >= var3 && arg0 <= this.field2732[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
