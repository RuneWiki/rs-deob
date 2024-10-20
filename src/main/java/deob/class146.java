package deob;

@ObfuscatedName("el")
public class class146 extends class130 {

    @ObfuscatedName("el.k")
    public final int field2008;

    @ObfuscatedName("el.y")
    public final int field2005;

    @ObfuscatedName("el.o")
    public final int[] field2004;

    @ObfuscatedName("el.r")
    public final int[] field2007;

    public class146(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2008 = arg0;
        this.field2005 = arg1;
        this.field2004 = arg2;
        this.field2007 = arg3;
    }

    @ObfuscatedName("el.k(IIB)Z")
    public boolean method2532(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2007.length) {
            int var3 = this.field2007[arg1];
            if (arg0 >= var3 && arg0 <= this.field2004[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
