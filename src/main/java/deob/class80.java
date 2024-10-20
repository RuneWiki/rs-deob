package deob;

@ObfuscatedName("dc")
public class class80 extends class276 {

    @ObfuscatedName("dc.am")
    public int field994;

    @ObfuscatedName("dc.ap")
    public int field990;

    @ObfuscatedName("dc.af")
    public int field992;

    @ObfuscatedName("dc.aj")
    public int field993;

    @ObfuscatedName("dc.aq")
    public int field991;

    @ObfuscatedName("dc.ar")
    public int field1002;

    @ObfuscatedName("dc.ag")
    public class205 field996;

    @ObfuscatedName("dc.ao")
    public int field997;

    @ObfuscatedName("dc.ae")
    public int field998;

    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class276 arg8) {
        this.field994 = arg0;
        this.field990 = arg1;
        this.field992 = arg2;
        this.field993 = arg3;
        this.field991 = arg4;
        this.field1002 = arg5;
        if (arg6 != -1) {
            this.field996 = class205.method73(arg6);
            this.field997 = 0;
            this.field998 = client.field677 - 1;
            if (this.field996.field2247 == 0 && arg8 != null && arg8 instanceof class80) {
                class80 var10 = (class80) arg8;
                if (this.field996 == var10.field996) {
                    this.field997 = var10.field997;
                    this.field998 = var10.field998;
                    return;
                }
            }
            if (arg7 && this.field996.field2238 != -1) {
                if (this.field996.method3760()) {
                    this.field997 = (int) (Math.random() * (double) this.field996.method3784());
                } else {
                    this.field997 = (int) (Math.random() * (double) this.field996.field2222.length);
                    this.field998 -= (int) (Math.random() * (double) this.field996.field2234[this.field997]);
                }
            }
        }
    }

    @ObfuscatedName("dc.ap(I)Lko;")
    public final class283 method2053() {
        if (this.field996 != null) {
            int var1 = client.field677 - this.field998;
            if (var1 > 100 && this.field996.field2238 > 0) {
                var1 = 100;
            }
            if (this.field996.method3760()) {
                int var2 = this.field996.method3784();
                this.field997 += var1;
                var1 = 0;
                if (this.field997 >= var2) {
                    this.field997 = var2 - this.field996.field2238;
                    if (this.field997 < 0 || this.field997 > var2) {
                        this.field996 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field996.field2234[this.field997]) {
                                break label69;
                            }
                            var1 -= this.field996.field2234[this.field997];
                            this.field997++;
                        } while (this.field997 < this.field996.field2222.length);
                        this.field997 -= this.field996.field2238;
                    } while (this.field997 >= 0 && this.field997 < this.field996.field2222.length);
                    this.field996 = null;
                }
            }
            this.field998 = client.field677 - var1;
        }
        class202 var3 = class202.method3023(this.field994);
        if (var3.field2097 != null) {
            var3 = var3.method3608();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field992 == 1 || this.field992 == 3) {
            var4 = var3.field2096;
            var5 = var3.field2120;
        } else {
            var4 = var3.field2120;
            var5 = var3.field2096;
        }
        int var6 = (var4 >> 1) + this.field991;
        int var7 = (var4 + 1 >> 1) + this.field991;
        int var8 = (var5 >> 1) + this.field1002;
        int var9 = (var5 + 1 >> 1) + this.field1002;
        int[][] var10 = class82.field1020[this.field993];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field991 << 7) + (var4 << 6);
        int var13 = (this.field1002 << 7) + (var5 << 6);
        return var3.method3614(this.field990, this.field992, var10, var12, var11, var13, this.field996, this.field997);
    }
}
