package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ai")
public class class33 {

    @ObfuscatedName("ai.e")
    public int field455 = -1;

    @ObfuscatedName("ai.o")
    public String field464;

    @ObfuscatedName("ai.m")
    public String field462;

    @ObfuscatedName("ai.g")
    public int field456 = -1;

    @ObfuscatedName("ai.d")
    public int field457 = -1;

    @ObfuscatedName("ai.b")
    public class213 field458 = null;

    @ObfuscatedName("ai.k")
    public int field459 = Integer.MAX_VALUE;

    @ObfuscatedName("ai.f")
    public int field460 = 0;

    @ObfuscatedName("ai.j")
    public int field461 = Integer.MAX_VALUE;

    @ObfuscatedName("ai.q")
    public int field453 = 0;

    @ObfuscatedName("ai.h")
    public boolean field463 = false;

    @ObfuscatedName("ai.i")
    public LinkedList field454;

    @ObfuscatedName("ai.e(Lfw;IB)V")
    public void method233(class174 arg0, int arg1) {
        this.field455 = arg1;
        this.field464 = arg0.method2899();
        this.field462 = arg0.method2899();
        this.field458 = new class213(arg0.method2896());
        this.field456 = arg0.method2896();
        arg0.method2891();
        this.field463 = arg0.method2891() == 1;
        this.field457 = arg0.method2891();
        int var3 = arg0.method2891();
        this.field454 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field454.add(this.method256(arg0));
        }
        this.method238();
    }

    @ObfuscatedName("ai.o(Lfw;I)Las;")
    public class43 method256(class174 arg0) {
        int var2 = arg0.method2891();
        class28 var3 = (class28) class169.method999(class28.method191(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field396) {
            case 0:
                var5 = new class39();
                break;
            case 1:
                var5 = new class49();
                break;
            case 2:
                var5 = new class27();
                break;
            case 3:
                var5 = new class31();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var5).method162(arg0);
        return (class43) var5;
    }

    @ObfuscatedName("ai.m(IIII)Z")
    public boolean method261(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field454.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method168(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ai.g(III)Z")
    public boolean method252(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field459 || var3 > this.field460) {
            return false;
        } else if (var4 >= this.field461 && var4 <= this.field453) {
            Iterator var5 = this.field454.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method186(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ai.d(IIII)[I")
    public int[] method236(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field454.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method168(arg0, arg1, arg2));
        return var5.method163(arg0, arg1, arg2);
    }

    @ObfuscatedName("ai.b(III)Lhh;")
    public class213 method247(int arg0, int arg1) {
        Iterator var3 = this.field454.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method186(arg0, arg1));
        return var4.method164(arg0, arg1);
    }

    @ObfuscatedName("ai.k(B)V")
    public void method238() {
        Iterator var1 = this.field454.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method175(this);
        }
    }

    @ObfuscatedName("ai.q(I)I")
    public int method239() {
        return this.field455;
    }

    @ObfuscatedName("ai.h(B)Z")
    public boolean method240() {
        return this.field463;
    }

    @ObfuscatedName("ai.i(B)Ljava/lang/String;")
    public String method235() {
        return this.field464;
    }

    @ObfuscatedName("ai.s(I)Ljava/lang/String;")
    public String method242() {
        return this.field462;
    }

    @ObfuscatedName("ai.n(I)I")
    public int method289() {
        return this.field456;
    }

    @ObfuscatedName("ai.c(I)I")
    public int method232() {
        return this.field457;
    }

    @ObfuscatedName("ai.v(B)I")
    public int method245() {
        return this.field459;
    }

    @ObfuscatedName("ai.u(I)I")
    public int method246() {
        return this.field460;
    }

    @ObfuscatedName("ai.w(B)I")
    public int method294() {
        return this.field461;
    }

    @ObfuscatedName("ai.p(I)I")
    public int method244() {
        return this.field453;
    }

    @ObfuscatedName("ai.l(I)I")
    public int method249() {
        return this.field458.field2595;
    }

    @ObfuscatedName("ai.x(B)I")
    public int method250() {
        return this.field458.field2596;
    }

    @ObfuscatedName("ai.r(S)I")
    public int method248() {
        return this.field458.field2597;
    }

    @ObfuscatedName("ai.t(B)Lhh;")
    public class213 method303() {
        return new class213(this.field458);
    }
}
