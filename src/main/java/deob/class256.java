package deob;

@ObfuscatedName("iw")
public class class256 extends class365 {

    @ObfuscatedName("iw.l")
    public final int field3000;

    @ObfuscatedName("iw.q")
    public final int field3001;

    @ObfuscatedName("iw.f")
    public final int[] field3002;

    @ObfuscatedName("iw.j")
    public final int[] field3003;

    public class256(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3000 = arg0;
        this.field3001 = arg1;
        this.field3002 = arg2;
        this.field3003 = arg3;
    }

    @ObfuscatedName("iw.l(IIB)Z")
    public boolean method4484(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3003.length) {
            int var3 = this.field3003[arg1];
            if (arg0 >= var3 && arg0 <= this.field3002[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
