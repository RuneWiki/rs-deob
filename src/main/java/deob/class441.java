package deob;

@ObfuscatedName("qi")
public class class441 extends class447 {

    @ObfuscatedName("qi.ah")
    public final class505 field4670;

    @ObfuscatedName("qi.ar")
    public final class439 field4671;

    @ObfuscatedName("qi.ao")
    public String field4673 = null;

    @ObfuscatedName("qi.ab")
    public String field4674 = null;

    @ObfuscatedName("qi.au")
    public byte field4675;

    @ObfuscatedName("qi.aa")
    public int field4672;

    @ObfuscatedName("qi.ac")
    public int field4677 = 1;

    public class441(class505 arg0, class439 arg1) {
        super(500);
        this.field4670 = arg0;
        this.field4671 = arg1;
    }

    @ObfuscatedName("qi.at(I)Lrf;")
    public class445 method7337() {
        return new class444();
    }

    @ObfuscatedName("qi.ah(II)[Lrf;")
    public class445[] method7338(int arg0) {
        return new class444[arg0];
    }

    @ObfuscatedName("qi.ar(Ljava/lang/String;I)V")
    public final void method7356(String arg0) {
        this.field4673 = class401.method2916(arg0);
    }

    @ObfuscatedName("qi.al(Ljava/lang/String;B)V")
    public final void method7357(String arg0) {
        this.field4674 = class401.method2916(arg0);
    }

    @ObfuscatedName("qi.az(Luj;IB)V")
    public final void method7358(class527 arg0, int arg1) {
        this.method7357(arg0.method8535());
        long var3 = arg0.method8417();
        long var5 = var3;
        String var7;
        if (var3 <= 0L || var3 >= 6582952005840035281L) {
            var7 = null;
        } else if (var3 % 37L == 0L) {
            var7 = null;
        } else {
            int var8 = 0;
            for (long var9 = var3; var9 != 0L; var9 /= 37L) {
                var8++;
            }
            StringBuilder var11 = new StringBuilder(var8);
            while (var5 != 0L) {
                long var12 = var5;
                var5 /= 37L;
                var11.append(class401.field4468[(int) (var12 - var5 * 37L)]);
            }
            var7 = var11.reverse().toString();
        }
        this.method7356(var7);
        this.field4675 = arg0.method8616();
        int var14;
        short var15;
        if (arg1 == 1) {
            var14 = arg0.method8410();
            var15 = 255;
        } else if (arg1 == 2) {
            var14 = arg0.method8427();
            var15 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var14 == var15) {
            return;
        }
        int var16 = var14;
        this.method7460();
        for (int var17 = 0; var17 < var16; var17++) {
            class444 var18 = (class444) this.method7446(new class550(arg0.method8535(), this.field4670));
            int var19 = arg0.method8412();
            var18.method7525(var19, ++this.field4677 - 1);
            var18.field4704 = arg0.method8616();
            arg0.method8535();
            this.method7368(var18);
        }
    }

    @ObfuscatedName("qi.ap(Luj;I)V")
    public final void method7359(class527 arg0) {
        class550 var2 = new class550(arg0.method8535(), this.field4670);
        int var3 = arg0.method8412();
        byte var4 = arg0.method8616();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method7456() == 0) {
                return;
            }
            class444 var6 = (class444) this.method7473(var2);
            if (var6 != null && var6.method7520() == var3) {
                this.method7445(var6);
            }
            return;
        }
        arg0.method8535();
        class444 var7 = (class444) this.method7473(var2);
        if (var7 == null) {
            if (this.method7456() > this.field4694) {
                return;
            }
            var7 = (class444) this.method7446(var2);
        }
        var7.method7525(var3, ++this.field4677 - 1);
        var7.field4704 = var4;
        this.method7368(var7);
    }

    @ObfuscatedName("qi.av(I)V")
    public final void method7360() {
        for (int var1 = 0; var1 < this.method7456(); var1++) {
            ((class444) this.method7448(var1)).method7397();
        }
    }

    @ObfuscatedName("qi.ax(I)V")
    public final void method7363() {
        for (int var1 = 0; var1 < this.method7456(); var1++) {
            ((class444) this.method7448(var1)).method7407();
        }
    }

    @ObfuscatedName("qi.as(Lrp;S)V")
    public final void method7368(class444 arg0) {
        if (arg0.method7428().equals(this.field4671.method1208())) {
            this.field4672 = arg0.field4704;
        }
    }
}
