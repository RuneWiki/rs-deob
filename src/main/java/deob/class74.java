package deob;

@ObfuscatedName("k")
public class class74 extends class107 {

    @ObfuscatedName("k.d")
    public int field1068;

    @ObfuscatedName("k.b")
    public int field1060;

    @ObfuscatedName("k.c")
    public int field1067;

    @ObfuscatedName("k.m")
    public int field1062;

    @ObfuscatedName("k.j")
    public int field1066;

    @ObfuscatedName("k.i")
    public int field1061;

    @ObfuscatedName("k.v")
    public int field1069;

    @ObfuscatedName("k.z")
    public int field1063;

    @ObfuscatedName("k.x")
    public class165 field1064;

    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class107 arg8) {
        this.field1069 = arg0;
        this.field1067 = arg1;
        this.field1060 = arg2;
        this.field1061 = arg3;
        this.field1062 = arg4;
        this.field1063 = arg5;
        if (arg6 != -1) {
            this.field1064 = class165.method3233(arg6);
            this.field1068 = 0;
            this.field1066 = client.field1468 - 1;
            if (this.field1064.field2535 == 0 && arg8 != null && arg8 instanceof class74) {
                class74 var10 = (class74) arg8;
                if (this.field1064 == var10.field1064) {
                    this.field1068 = var10.field1068;
                    this.field1066 = var10.field1066;
                    return;
                }
            }
            if (arg7 && this.field1064.field2536 != -1) {
                this.field1068 = (int) (Math.random() * (double) this.field1064.field2522.length);
                this.field1066 -= (int) (Math.random() * (double) this.field1064.field2526[this.field1068]);
            }
        }
    }

    @ObfuscatedName("k.c(I)Ldk;")
    public final class43 method908() {
        if (this.field1064 != null) {
            int var1 = client.field1468 - this.field1066;
            if (var1 > 100 && this.field1064.field2536 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1064.field2526[this.field1068]) {
                            break label47;
                        }
                        var1 -= this.field1064.field2526[this.field1068];
                        this.field1068++;
                    } while (this.field1068 < this.field1064.field2522.length);
                    this.field1068 -= this.field1064.field2536;
                } while (this.field1068 >= 0 && this.field1068 < this.field1064.field2522.length);
                this.field1064 = null;
            }
            this.field1066 = client.field1468 - var1;
        }
        class181 var2 = class181.method925(this.field1069);
        if (var2.field2800 != null) {
            var2 = var2.method3392();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1060 == 1 || this.field1060 == 3) {
            var3 = var2.field2758;
            var4 = var2.field2791;
        } else {
            var3 = var2.field2791;
            var4 = var2.field2758;
        }
        int var5 = (var3 >> 1) + this.field1062;
        int var6 = (var3 + 1 >> 1) + this.field1062;
        int var7 = (var4 >> 1) + this.field1063;
        int var8 = (var4 + 1 >> 1) + this.field1063;
        int[][] var9 = class72.field1034[this.field1061];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1062 << 7) + (var3 << 6);
        int var12 = (this.field1063 << 7) + (var4 << 6);
        return var2.method3390(this.field1067, this.field1060, var9, var11, var10, var12, this.field1064, this.field1068);
    }
}
