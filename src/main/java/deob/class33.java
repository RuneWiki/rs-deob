package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ai")
public class class33 {

    @ObfuscatedName("ai.i")
    public int field467 = -1;

    @ObfuscatedName("ai.c")
    public String field454;

    @ObfuscatedName("ai.e")
    public String field455;

    @ObfuscatedName("ai.v")
    public int field456 = -1;

    @ObfuscatedName("ai.b")
    public int field468 = -1;

    @ObfuscatedName("ai.y")
    public class213 field458 = null;

    @ObfuscatedName("ai.h")
    public int field459 = Integer.MAX_VALUE;

    @ObfuscatedName("ai.x")
    public int field466 = 0;

    @ObfuscatedName("ai.f")
    public int field457 = Integer.MAX_VALUE;

    @ObfuscatedName("ai.n")
    public int field462 = 0;

    @ObfuscatedName("ai.a")
    public boolean field463 = false;

    @ObfuscatedName("ai.o")
    public LinkedList field453;

    @ObfuscatedName("ai.i(Lfx;II)V")
    public void method242(class174 arg0, int arg1) {
        this.field467 = arg1;
        this.field454 = arg0.method2878();
        this.field455 = arg0.method2878();
        this.field458 = new class213(arg0.method2875());
        this.field456 = arg0.method2875();
        arg0.method2870();
        this.field463 = arg0.method2870() == 1;
        this.field468 = arg0.method2870();
        int var3 = arg0.method2870();
        this.field453 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field453.add(this.method238(arg0));
        }
        this.method237();
    }

    @ObfuscatedName("ai.c(Lfx;I)Laz;")
    public class43 method238(class174 arg0) {
        int var2 = arg0.method2870();
        class28[] var3 = new class28[] { class28.field403, class28.field395, class28.field406, class28.field396 };
        class28 var4 = (class28) class169.method1610(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field394) {
            case 0:
                var6 = new class49();
                break;
            case 1:
                var6 = new class39();
                break;
            case 2:
                var6 = new class31();
                break;
            case 3:
                var6 = new class27();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var6).method174(arg0);
        return (class43) var6;
    }

    @ObfuscatedName("ai.e(IIII)Z")
    public boolean method233(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field453.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method166(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ai.v(IIB)Z")
    public boolean method253(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field459 || var3 > this.field466) {
            return false;
        } else if (var4 >= this.field457 && var4 <= this.field462) {
            Iterator var5 = this.field453.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method167(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ai.b(IIIB)[I")
    public int[] method235(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field453.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method166(arg0, arg1, arg2));
        return var5.method168(arg0, arg1, arg2);
    }

    @ObfuscatedName("ai.y(III)Lhh;")
    public class213 method236(int arg0, int arg1) {
        Iterator var3 = this.field453.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method167(arg0, arg1));
        return var4.method186(arg0, arg1);
    }

    @ObfuscatedName("ai.h(B)V")
    public void method237() {
        Iterator var1 = this.field453.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method165(this);
        }
    }

    @ObfuscatedName("ai.x(I)I")
    public int method243() {
        return this.field467;
    }

    @ObfuscatedName("ai.f(I)Z")
    public boolean method239() {
        return this.field463;
    }

    @ObfuscatedName("ai.n(I)Ljava/lang/String;")
    public String method240() {
        return this.field454;
    }

    @ObfuscatedName("ai.a(B)Ljava/lang/String;")
    public String method241() {
        return this.field455;
    }

    @ObfuscatedName("ai.o(B)I")
    public int method263() {
        return this.field456;
    }

    @ObfuscatedName("ai.z(I)I")
    public int method299() {
        return this.field468;
    }

    @ObfuscatedName("ai.q(I)I")
    public int method269() {
        return this.field459;
    }

    @ObfuscatedName("ai.j(I)I")
    public int method245() {
        return this.field466;
    }

    @ObfuscatedName("ai.l(B)I")
    public int method246() {
        return this.field457;
    }

    @ObfuscatedName("ai.u(I)I")
    public int method247() {
        return this.field462;
    }

    @ObfuscatedName("ai.t(I)I")
    public int method248() {
        return this.field458.field2617;
    }

    @ObfuscatedName("ai.ad(I)I")
    public int method244() {
        return this.field458.field2616;
    }

    @ObfuscatedName("ai.ar(B)I")
    public int method250() {
        return this.field458.field2615;
    }

    @ObfuscatedName("ai.an(I)Lhh;")
    public class213 method251() {
        return new class213(this.field458);
    }
}
