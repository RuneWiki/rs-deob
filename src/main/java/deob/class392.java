package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ok")
public final class class392 {

    @ObfuscatedName("ok.f")
    public final Comparator field4527;

    @ObfuscatedName("ok.w")
    public final Map field4522;

    @ObfuscatedName("ok.v")
    public final class371 field4523;

    @ObfuscatedName("ok.s")
    public final class371 field4521;

    @ObfuscatedName("ok.z")
    public final long field4524;

    @ObfuscatedName("ok.j")
    public final class390 field4526;

    @ObfuscatedName("ok.i")
    public final int field4525;

    public class392(int arg0, class390 arg1) {
        this(-1L, arg0, arg1);
    }

    public class392(long arg0, int arg1, class390 arg2) {
        this.field4527 = new class391(this);
        this.field4524 = arg0;
        this.field4525 = arg1;
        this.field4526 = arg2;
        if (this.field4525 == -1) {
            this.field4522 = new HashMap(64);
            this.field4523 = new class371(64, this.field4527);
            this.field4521 = null;
        } else if (this.field4526 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4522 = new HashMap(this.field4525);
            this.field4523 = new class371(this.field4525, this.field4527);
            this.field4521 = new class371(this.field4525);
        }
    }

    @ObfuscatedName("ok.f(B)Z")
    public boolean method6911() {
        return this.field4525 != -1;
    }

    @ObfuscatedName("ok.w(Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method6912(Object arg0) {
        synchronized (this) {
            if (this.field4524 != -1L) {
                this.method6915();
            }
            class393 var3 = (class393) this.field4522.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method6914(var3, false);
                return var3.field4532;
            }
        }
    }

    @ObfuscatedName("ok.v(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method6913(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4524 != -1L) {
                this.method6915();
            }
            class393 var4 = (class393) this.field4522.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4532;
                var4.field4532 = arg1;
                this.method6914(var4, false);
                return var5;
            }
            if (this.method6911() && this.field4522.size() == this.field4525) {
                class393 var6 = (class393) this.field4521.remove();
                this.field4522.remove(var6.field4530);
                this.field4523.remove(var6);
            }
            class393 var7 = new class393(arg1, arg0);
            this.field4522.put(arg0, var7);
            this.method6914(var7, true);
            return null;
        }
    }

    @ObfuscatedName("ok.s(Loh;ZI)V")
    public void method6914(class393 arg0, boolean arg1) {
        if (!arg1) {
            this.field4523.remove(arg0);
            if (this.method6911() && !this.field4521.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4531 = System.currentTimeMillis();
        if (this.method6911()) {
            switch(this.field4526.field4515) {
                case 0:
                    arg0.field4529 = arg0.field4531;
                    break;
                case 1:
                    arg0.field4529++;
            }
            this.field4521.add(arg0);
        }
        this.field4523.add(arg0);
    }

    @ObfuscatedName("ok.z(I)V")
    public void method6915() {
        if (this.field4524 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4524;
        while (!this.field4523.isEmpty()) {
            class393 var3 = (class393) this.field4523.peek();
            if (var3.field4531 >= var1) {
                return;
            }
            this.field4522.remove(var3.field4530);
            this.field4523.remove(var3);
            if (this.method6911()) {
                this.field4521.remove(var3);
            }
        }
    }

    @ObfuscatedName("ok.j(B)V")
    public void method6916() {
        synchronized (this) {
            this.field4522.clear();
            this.field4523.clear();
            if (this.method6911()) {
                this.field4521.clear();
            }
        }
    }
}
