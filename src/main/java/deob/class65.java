package deob;

@ObfuscatedName("cx")
public class class65 extends class470 {

    @ObfuscatedName("cx.aw")
    public int field497;

    @ObfuscatedName("cx.ay")
    public int field506;

    @ObfuscatedName("cx.ar")
    public int field499;

    @ObfuscatedName("cx.am")
    public String field500;

    @ObfuscatedName("cx.as")
    public class538 field501;

    @ObfuscatedName("cx.aj")
    public class439 field502 = class439.field4675;

    @ObfuscatedName("cx.ag")
    public class439 field503 = class439.field4675;

    @ObfuscatedName("cx.az")
    public String field504;

    @ObfuscatedName("cx.av")
    public String field498;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1152(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cx.aw(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1152(int arg0, String arg1, String arg2, String arg3) {
        this.field497 = class111.method7160();
        this.field506 = client.field530;
        this.field499 = arg0;
        this.field500 = arg1;
        this.method1147();
        this.field504 = arg2;
        this.field498 = arg3;
        this.method1141();
        this.method1139();
    }

    @ObfuscatedName("cx.ay(B)V")
    public void method1141() {
        this.field502 = class439.field4675;
    }

    @ObfuscatedName("cx.ar(I)Z")
    public final boolean method1142() {
        if (class439.field4675 == this.field502) {
            this.method1153();
        }
        return class439.field4676 == this.field502;
    }

    @ObfuscatedName("cx.am(I)V")
    public void method1153() {
        this.field502 = Statics.field1858.field842.method7262(this.field501) ? class439.field4676 : class439.field4677;
    }

    @ObfuscatedName("cx.as(B)V")
    public void method1139() {
        this.field503 = class439.field4675;
    }

    @ObfuscatedName("cx.aj(I)Z")
    public final boolean method1145() {
        if (class439.field4675 == this.field503) {
            this.method1146();
        }
        return class439.field4676 == this.field503;
    }

    @ObfuscatedName("cx.ag(B)V")
    public void method1146() {
        this.field503 = Statics.field1858.field843.method7262(this.field501) ? class439.field4676 : class439.field4677;
    }

    @ObfuscatedName("cx.az(I)V")
    public final void method1147() {
        if (this.field500 == null) {
            this.field501 = null;
        } else {
            this.field501 = new class538(client.method7230(this.field500), Statics.field4771);
        }
    }
}
