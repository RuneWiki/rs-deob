package deob;

@ObfuscatedName("hh")
public class class221 extends class185 {

    @ObfuscatedName("hh.m")
    public final int field2557;

    @ObfuscatedName("hh.o")
    public final int field2555;

    @ObfuscatedName("hh.q")
    public final int[] field2556;

    @ObfuscatedName("hh.j")
    public final int[] field2559;

    public class221(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2557 = arg0;
        this.field2555 = arg1;
        this.field2556 = arg2;
        this.field2559 = arg3;
    }

    @ObfuscatedName("hh.m(III)Z")
    public boolean method3704(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2559.length) {
            int var3 = this.field2559[arg1];
            if (arg0 >= var3 && arg0 <= this.field2556[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
