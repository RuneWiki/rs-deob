package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("aj")
public class class33 {

    @ObfuscatedName("aj.i")
    public int field453 = -1;

    @ObfuscatedName("aj.h")
    public String field460;

    @ObfuscatedName("aj.u")
    public String field450;

    @ObfuscatedName("aj.q")
    public int field451 = -1;

    @ObfuscatedName("aj.g")
    public int field452 = -1;

    @ObfuscatedName("aj.v")
    public class213 field463 = null;

    @ObfuscatedName("aj.t")
    public int field454 = Integer.MAX_VALUE;

    @ObfuscatedName("aj.p")
    public int field455 = 0;

    @ObfuscatedName("aj.l")
    public int field464 = Integer.MAX_VALUE;

    @ObfuscatedName("aj.a")
    public int field457 = 0;

    @ObfuscatedName("aj.k")
    public boolean field458 = false;

    @ObfuscatedName("aj.r")
    public LinkedList field459;

    @ObfuscatedName("aj.i(Lfv;IS)V")
    public void method240(class174 arg0, int arg1) {
        this.field453 = arg1;
        this.field460 = arg0.method2938();
        this.field450 = arg0.method2938();
        this.field463 = new class213(arg0.method2927());
        this.field451 = arg0.method2927();
        arg0.method2930();
        this.field458 = arg0.method2930() == 1;
        this.field452 = arg0.method2930();
        int var3 = arg0.method2930();
        this.field459 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field459.add(this.method241(arg0));
        }
        this.method246();
    }

    @ObfuscatedName("aj.h(Lfv;S)Lam;")
    public class43 method241(class174 arg0) {
        int var2 = arg0.method2930();
        class28 var3 = (class28) class169.method1267(class28.method202(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field395) {
            case 0:
                var5 = new class49();
                break;
            case 1:
                var5 = new class31();
                break;
            case 2:
                var5 = new class39();
                break;
            case 3:
                var5 = new class27();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var5).method195(arg0);
        return (class43) var5;
    }

    @ObfuscatedName("aj.u(IIII)Z")
    public boolean method239(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field459.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method174(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("aj.q(III)Z")
    public boolean method244(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field454 || var3 > this.field455) {
            return false;
        } else if (var4 >= this.field464 && var4 <= this.field457) {
            Iterator var5 = this.field459.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method175(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aj.g(IIIS)[I")
    public int[] method249(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field459.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method174(arg0, arg1, arg2));
        return var5.method176(arg0, arg1, arg2);
    }

    @ObfuscatedName("aj.v(III)Lho;")
    public class213 method310(int arg0, int arg1) {
        Iterator var3 = this.field459.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method175(arg0, arg1));
        return var4.method191(arg0, arg1);
    }

    @ObfuscatedName("aj.t(B)V")
    public void method246() {
        Iterator var1 = this.field459.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method196(this);
        }
    }

    @ObfuscatedName("aj.p(I)I")
    public int method287() {
        return this.field453;
    }

    @ObfuscatedName("aj.l(I)Z")
    public boolean method299() {
        return this.field458;
    }

    @ObfuscatedName("aj.a(I)Ljava/lang/String;")
    public String method264() {
        return this.field460;
    }

    @ObfuscatedName("aj.k(S)Ljava/lang/String;")
    public String method319() {
        return this.field450;
    }

    @ObfuscatedName("aj.b(B)I")
    public int method251() {
        return this.field451;
    }

    @ObfuscatedName("aj.x(B)I")
    public int method252() {
        return this.field452;
    }

    @ObfuscatedName("aj.o(I)I")
    public int method306() {
        return this.field454;
    }

    @ObfuscatedName("aj.j(I)I")
    public int method254() {
        return this.field455;
    }

    @ObfuscatedName("aj.m(I)I")
    public int method255() {
        return this.field464;
    }

    @ObfuscatedName("aj.s(I)I")
    public int method256() {
        return this.field457;
    }

    @ObfuscatedName("aj.n(I)I")
    public int method262() {
        return this.field463.field2601;
    }

    @ObfuscatedName("aj.y(I)I")
    public int method258() {
        return this.field463.field2604;
    }

    @ObfuscatedName("aj.w(I)I")
    public int method242() {
        return this.field463.field2602;
    }

    @ObfuscatedName("aj.f(I)Lho;")
    public class213 method260() {
        return new class213(this.field463);
    }
}
