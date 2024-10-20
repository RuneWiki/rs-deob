package deob;

@ObfuscatedName("jr")
public class class244 {

    @ObfuscatedName("jr.ah")
    public class129[] field2618;

    @ObfuscatedName("jr.af")
    public int field2617;

    public class244(class535 arg0, int arg1) {
        this.field2618 = new class129[arg1];
        this.field2617 = arg0.method8462();
        for (int var3 = 0; var3 < this.field2618.length; var3++) {
            class129 var4 = new class129(this.field2617, arg0, false);
            this.field2618[var3] = var4;
        }
        this.method4292();
    }

    @ObfuscatedName("jr.az(I)V")
    public void method4292() {
        class129[] var1 = this.field2618;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class129 var3 = var1[var2];
            if (var3.field1540 >= 0) {
                var3.field1544 = this.field2618[var3.field1540];
            }
        }
    }

    @ObfuscatedName("jr.ah(B)I")
    public int method4280() {
        return this.field2618.length;
    }

    @ObfuscatedName("jr.af(II)Lei;")
    public class129 method4281(int arg0) {
        return arg0 >= this.method4280() ? null : this.field2618[arg0];
    }

    @ObfuscatedName("jr.at(B)[Lei;")
    public class129[] method4282() {
        return this.field2618;
    }

    @ObfuscatedName("jr.an(Lfa;II)V")
    public void method4289(class139 arg0, int arg1) {
        this.method4284(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("jr.ao(Lfa;I[ZZB)V")
    public void method4284(class139 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2948();
        int var6 = 0;
        class129[] var7 = this.method4282();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class129 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2947(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
