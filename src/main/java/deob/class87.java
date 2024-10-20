package deob;

@ObfuscatedName("cy")
public final class class87 extends class145 {

    @ObfuscatedName("cy.f")
    public int field1146;

    @ObfuscatedName("cy.b")
    public int field1137;

    @ObfuscatedName("cy.l")
    public int field1138;

    @ObfuscatedName("cy.m")
    public int field1143;

    @ObfuscatedName("cy.z")
    public int field1141;

    @ObfuscatedName("cy.q")
    public int field1140;

    @ObfuscatedName("cy.k")
    public class270 field1142;

    @ObfuscatedName("cy.c")
    public int field1145 = 0;

    @ObfuscatedName("cy.u")
    public int field1144 = 0;

    @ObfuscatedName("cy.t")
    public boolean field1136 = false;

    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1146 = arg0;
        this.field1138 = arg1;
        this.field1143 = arg2;
        this.field1140 = arg3;
        this.field1141 = arg4;
        this.field1137 = arg5 + arg6;
        int var8 = class255.method1685(this.field1146).field3272;
        if (var8 == -1) {
            this.field1136 = true;
        } else {
            this.field1136 = false;
            this.field1142 = class270.method2219(var8);
        }
    }

    @ObfuscatedName("cy.f(II)V")
    public final void method1942(int arg0) {
        if (this.field1136) {
            return;
        }
        this.field1144 += arg0;
        while (this.field1144 > this.field1142.field3541[this.field1145]) {
            this.field1144 -= this.field1142.field3541[this.field1145];
            this.field1145++;
            if (this.field1145 >= this.field1142.field3539.length) {
                this.field1136 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cy.u(I)Leh;")
    public final class137 method1175() {
        class255 var1 = class255.method1685(this.field1146);
        class137 var2;
        if (this.field1136) {
            var2 = var1.method4158(-1);
        } else {
            var2 = var1.method4158(this.field1145);
        }
        return var2 == null ? null : var2;
    }
}
