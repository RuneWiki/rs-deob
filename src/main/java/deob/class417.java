package deob;

@ObfuscatedName("qy")
public class class417 extends class423 {

    @ObfuscatedName("qy.an")
    public final class481 field4586;

    @ObfuscatedName("qy.av")
    public final class415 field4585;

    @ObfuscatedName("qy.as")
    public String field4583 = null;

    @ObfuscatedName("qy.ax")
    public String field4587 = null;

    @ObfuscatedName("qy.ap")
    public byte field4582;

    @ObfuscatedName("qy.ab")
    public int field4588;

    @ObfuscatedName("qy.ak")
    public int field4589 = 1;

    public class417(class481 arg0, class415 arg1) {
        super(500);
        this.field4586 = arg0;
        this.field4585 = arg1;
    }

    @ObfuscatedName("qy.at(I)Lqm;")
    public class421 method7075() {
        return new class420();
    }

    @ObfuscatedName("qy.an(IB)[Lqm;")
    public class421[] method7070(int arg0) {
        return new class420[arg0];
    }

    @ObfuscatedName("qy.av(Ljava/lang/String;B)V")
    public final void method7083(String arg0) {
        String var2 = class387.method5371(class387.method3059(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4583 = var2;
    }

    @ObfuscatedName("qy.ab(Ljava/lang/String;I)V")
    public final void method7084(String arg0) {
        String var2 = class387.method5371(class387.method3059(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4587 = var2;
    }

    @ObfuscatedName("qy.ak(Ltz;II)V")
    public final void method7085(class501 arg0, int arg1) {
        this.method7084(arg0.method8253());
        long var3 = arg0.method8135();
        this.method7083(class387.method5370(var3));
        this.field4582 = arg0.method8130();
        int var5;
        short var6;
        if (arg1 == 1) {
            var5 = arg0.method8129();
            var6 = 255;
        } else if (arg1 == 2) {
            var5 = arg0.method8158();
            var6 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var5 == var6) {
            return;
        }
        int var7 = var5;
        this.method7216();
        for (int var8 = 0; var8 < var7; var8++) {
            class420 var9 = (class420) this.method7242(new class525(arg0.method8253(), this.field4586));
            int var10 = arg0.method8195();
            var9.method7250(var10, ++this.field4589 - 1);
            var9.field4614 = arg0.method8130();
            arg0.method8253();
            this.method7104(var9);
        }
    }

    @ObfuscatedName("qy.ae(Ltz;I)V")
    public final void method7101(class501 arg0) {
        class525 var2 = new class525(arg0.method8253(), this.field4586);
        int var3 = arg0.method8195();
        byte var4 = arg0.method8130();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method7181() == 0) {
                return;
            }
            class420 var6 = (class420) this.method7178(var2);
            if (var6 != null && var6.method7249() == var3) {
                this.method7232(var6);
            }
            return;
        }
        arg0.method8253();
        class420 var7 = (class420) this.method7178(var2);
        if (var7 == null) {
            if (this.method7181() > this.field4603) {
                return;
            }
            var7 = (class420) this.method7242(var2);
        }
        var7.method7250(var3, ++this.field4589 - 1);
        var7.field4614 = var4;
        this.method7104(var7);
    }

    @ObfuscatedName("qy.af(S)V")
    public final void method7087() {
        for (int var1 = 0; var1 < this.method7181(); var1++) {
            ((class420) this.method7184(var1)).method7121();
        }
    }

    @ObfuscatedName("qy.ao(I)V")
    public final void method7088() {
        for (int var1 = 0; var1 < this.method7181(); var1++) {
            ((class420) this.method7184(var1)).method7132();
        }
    }

    @ObfuscatedName("qy.aa(Lqb;B)V")
    public final void method7104(class420 arg0) {
        if (arg0.method7150().equals(this.field4585.method1155())) {
            this.field4588 = arg0.field4614;
        }
    }
}
