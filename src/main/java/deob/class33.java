package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ae")
public class class33 {

    @ObfuscatedName("ae.p")
    public int field421 = -1;

    @ObfuscatedName("ae.i")
    public String field422;

    @ObfuscatedName("ae.w")
    public String field430;

    @ObfuscatedName("ae.s")
    public int field424 = -1;

    @ObfuscatedName("ae.j")
    public int field425 = -1;

    @ObfuscatedName("ae.a")
    public class224 field433 = null;

    @ObfuscatedName("ae.t")
    public int field427 = Integer.MAX_VALUE;

    @ObfuscatedName("ae.r")
    public int field434 = 0;

    @ObfuscatedName("ae.m")
    public int field429 = Integer.MAX_VALUE;

    @ObfuscatedName("ae.h")
    public int field423 = 0;

    @ObfuscatedName("ae.o")
    public boolean field431 = false;

    @ObfuscatedName("ae.x")
    public LinkedList field432;

    @ObfuscatedName("ae.p(Lgj;II)V")
    public void method313(class185 arg0, int arg1) {
        this.field421 = arg1;
        this.field422 = arg0.method3131();
        this.field430 = arg0.method3131();
        this.field433 = new class224(arg0.method3127());
        this.field424 = arg0.method3127();
        arg0.method3197();
        this.field431 = arg0.method3197() == 1;
        this.field425 = arg0.method3197();
        int var3 = arg0.method3197();
        this.field432 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field432.add(this.method275(arg0));
        }
        this.method265();
    }

    @ObfuscatedName("ae.i(Lgj;I)Lad;")
    public class43 method275(class185 arg0) {
        int var2 = arg0.method3197();
        class28 var3 = (class28) class180.method4646(class28.method218(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field370) {
            case 0:
                var5 = new class49();
                break;
            case 1:
                var5 = new class27();
                break;
            case 2:
                var5 = new class39();
                break;
            case 3:
                var5 = new class31();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var5).method189(arg0);
        return (class43) var5;
    }

    @ObfuscatedName("ae.w(IIII)Z")
    public boolean method261(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field432.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method185(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ae.s(III)Z")
    public boolean method262(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field427 || var3 > this.field434) {
            return false;
        } else if (var4 >= this.field429 && var4 <= this.field423) {
            Iterator var5 = this.field432.iterator();
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

    @ObfuscatedName("ae.j(IIII)[I")
    public int[] method263(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field432.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method185(arg0, arg1, arg2));
        return var5.method187(arg0, arg1, arg2);
    }

    @ObfuscatedName("ae.a(III)Lhn;")
    public class224 method264(int arg0, int arg1) {
        Iterator var3 = this.field432.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method186(arg0, arg1));
        return var4.method213(arg0, arg1);
    }

    @ObfuscatedName("ae.t(I)V")
    public void method265() {
        Iterator var1 = this.field432.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method184(this);
        }
    }

    @ObfuscatedName("ae.r(I)I")
    public int method266() {
        return this.field421;
    }

    @ObfuscatedName("ae.m(I)Z")
    public boolean method293() {
        return this.field431;
    }

    @ObfuscatedName("ae.h(B)Ljava/lang/String;")
    public String method268() {
        return this.field422;
    }

    @ObfuscatedName("ae.o(I)Ljava/lang/String;")
    public String method269() {
        return this.field430;
    }

    @ObfuscatedName("ae.x(I)I")
    public int method323() {
        return this.field424;
    }

    @ObfuscatedName("ae.q(I)I")
    public int method271() {
        return this.field425;
    }

    @ObfuscatedName("ae.d(B)I")
    public int method327() {
        return this.field427;
    }

    @ObfuscatedName("ae.l(I)I")
    public int method273() {
        return this.field434;
    }

    @ObfuscatedName("ae.f(B)I")
    public int method274() {
        return this.field429;
    }

    @ObfuscatedName("ae.k(I)I")
    public int method276() {
        return this.field423;
    }

    @ObfuscatedName("ae.e(I)I")
    public int method324() {
        return this.field433.field2697;
    }

    @ObfuscatedName("ae.u(B)I")
    public int method318() {
        return this.field433.field2700;
    }

    @ObfuscatedName("ae.z(I)I")
    public int method277() {
        return this.field433.field2698;
    }

    @ObfuscatedName("ae.b(B)Lhn;")
    public class224 method278() {
        return new class224(this.field433);
    }
}
