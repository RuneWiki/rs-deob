package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ar")
public class class33 {

    @ObfuscatedName("ar.i")
    public int field474 = -1;

    @ObfuscatedName("ar.w")
    public String field463;

    @ObfuscatedName("ar.a")
    public String field471;

    @ObfuscatedName("ar.t")
    public int field465 = -1;

    @ObfuscatedName("ar.s")
    public int field466 = -1;

    @ObfuscatedName("ar.r")
    public class213 field464 = null;

    @ObfuscatedName("ar.v")
    public int field468 = Integer.MAX_VALUE;

    @ObfuscatedName("ar.y")
    public int field469 = 0;

    @ObfuscatedName("ar.j")
    public int field473 = Integer.MAX_VALUE;

    @ObfuscatedName("ar.k")
    public int field467 = 0;

    @ObfuscatedName("ar.e")
    public boolean field472 = false;

    @ObfuscatedName("ar.o")
    public LinkedList field462;

    @ObfuscatedName("ar.i(Lfp;II)V")
    public void method278(class174 arg0, int arg1) {
        this.field474 = arg1;
        this.field463 = arg0.method2884();
        this.field471 = arg0.method2884();
        this.field464 = new class213(arg0.method2885());
        this.field465 = arg0.method2885();
        arg0.method3061();
        this.field472 = arg0.method3061() == 1;
        this.field466 = arg0.method3061();
        int var3 = arg0.method3061();
        this.field462 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field462.add(this.method237(arg0));
        }
        this.method242();
    }

    @ObfuscatedName("ar.w(Lfp;I)Laa;")
    public class43 method237(class174 arg0) {
        int var2 = arg0.method3061();
        class28[] var3 = new class28[] { class28.field396, class28.field399, class28.field406, class28.field397 };
        class28 var4 = (class28) class169.method2353(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field400) {
            case 0:
                var6 = new class39();
                break;
            case 1:
                var6 = new class31();
                break;
            case 2:
                var6 = new class27();
                break;
            case 3:
                var6 = new class49();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var6).method166(arg0);
        return (class43) var6;
    }

    @ObfuscatedName("ar.a(IIIB)Z")
    public boolean method238(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field462.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method167(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ar.t(III)Z")
    public boolean method270(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field468 || var3 > this.field469) {
            return false;
        } else if (var4 >= this.field473 && var4 <= this.field467) {
            Iterator var5 = this.field462.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method189(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ar.s(IIIB)[I")
    public int[] method280(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field462.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method167(arg0, arg1, arg2));
        return var5.method164(arg0, arg1, arg2);
    }

    @ObfuscatedName("ar.r(III)Lhb;")
    public class213 method241(int arg0, int arg1) {
        Iterator var3 = this.field462.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method189(arg0, arg1));
        return var4.method165(arg0, arg1);
    }

    @ObfuscatedName("ar.v(I)V")
    public void method242() {
        Iterator var1 = this.field462.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method162(this);
        }
    }

    @ObfuscatedName("ar.y(I)I")
    public int method243() {
        return this.field474;
    }

    @ObfuscatedName("ar.j(I)Z")
    public boolean method244() {
        return this.field472;
    }

    @ObfuscatedName("ar.k(I)Ljava/lang/String;")
    public String method245() {
        return this.field463;
    }

    @ObfuscatedName("ar.e(I)Ljava/lang/String;")
    public String method246() {
        return this.field471;
    }

    @ObfuscatedName("ar.o(I)I")
    public int method257() {
        return this.field465;
    }

    @ObfuscatedName("ar.z(I)I")
    public int method248() {
        return this.field466;
    }

    @ObfuscatedName("ar.l(I)I")
    public int method268() {
        return this.field468;
    }

    @ObfuscatedName("ar.c(I)I")
    public int method250() {
        return this.field469;
    }

    @ObfuscatedName("ar.b(S)I")
    public int method251() {
        return this.field473;
    }

    @ObfuscatedName("ar.f(I)I")
    public int method252() {
        return this.field467;
    }

    @ObfuscatedName("ar.n(I)I")
    public int method299() {
        return this.field464.field2616;
    }

    @ObfuscatedName("ar.u(I)I")
    public int method296() {
        return this.field464.field2617;
    }

    @ObfuscatedName("ar.p(I)I")
    public int method255() {
        return this.field464.field2618;
    }

    @ObfuscatedName("ar.q(I)Lhb;")
    public class213 method297() {
        return new class213(this.field464);
    }
}
