package deob;

@ObfuscatedName("fr")
public class class175 extends class204 {

    @ObfuscatedName("fr.z")
    public final int field2884;

    @ObfuscatedName("fr.q")
    public final int field2887;

    @ObfuscatedName("fr.k")
    public final int[] field2886;

    @ObfuscatedName("fr.f")
    public final int[] field2885;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2884 = arg0;
        this.field2887 = arg1;
        this.field2886 = arg2;
        this.field2885 = arg3;
    }

    @ObfuscatedName("fr.z(III)Z")
    public boolean method3163(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2885.length) {
            int var3 = this.field2885[arg1];
            if (arg0 >= var3 && arg0 <= this.field2886[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
