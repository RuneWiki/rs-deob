package deob;

@ObfuscatedName("ik")
public class class221 {

    @ObfuscatedName("ik.al")
    public class125[] field2494;

    @ObfuscatedName("ik.ac")
    public int field2496;

    public class221(class478 arg0, int arg1) {
        this.field2494 = new class125[arg1];
        this.field2496 = arg0.method7909();
        for (int var3 = 0; var3 < this.field2494.length; var3++) {
            class125 var4 = new class125(this.field2496, arg0, false);
            this.field2494[var3] = var4;
        }
        this.method4005();
    }

    @ObfuscatedName("ik.aj(B)V")
    public void method4005() {
        class125[] var1 = this.field2494;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class125 var3 = var1[var2];
            if (var3.field1466 >= 0) {
                var3.field1475 = this.field2494[var3.field1466];
            }
        }
    }

    @ObfuscatedName("ik.al(I)I")
    public int method4004() {
        return this.field2494.length;
    }

    @ObfuscatedName("ik.ac(IS)Lek;")
    public class125 method4007(int arg0) {
        return arg0 >= this.method4004() ? null : this.field2494[arg0];
    }

    @ObfuscatedName("ik.ab(I)[Lek;")
    public class125[] method4019() {
        return this.field2494;
    }

    @ObfuscatedName("ik.an(Lfl;II)V")
    public void method4009(class135 arg0, int arg1) {
        this.method4018(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("ik.ao(Lfl;I[ZZI)V")
    public void method4018(class135 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2915();
        int var6 = 0;
        class125[] var7 = this.method4019();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class125 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2904(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
