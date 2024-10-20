package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("pe")
public final class class395 {

    @ObfuscatedName("pe.aj")
    public final Comparator field4488;

    @ObfuscatedName("pe.al")
    public final Map field4485;

    @ObfuscatedName("pe.ac")
    public final class374 field4484;

    @ObfuscatedName("pe.ab")
    public final class374 field4482;

    @ObfuscatedName("pe.an")
    public final long field4483;

    @ObfuscatedName("pe.ao")
    public final class393 field4487;

    @ObfuscatedName("pe.av")
    public final int field4486;

    public class395(int arg0, class393 arg1) {
        this(-1L, arg0, arg1);
    }

    public class395(long arg0, int arg1, class393 arg2) {
        this.field4488 = new class394(this);
        this.field4483 = arg0;
        this.field4486 = arg1;
        this.field4487 = arg2;
        if (this.field4486 == -1) {
            this.field4485 = new HashMap(64);
            this.field4484 = new class374(64, this.field4488);
            this.field4482 = null;
        } else if (this.field4487 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4485 = new HashMap(this.field4486);
            this.field4484 = new class374(this.field4486, this.field4488);
            this.field4482 = new class374(this.field4486);
        }
    }

    @ObfuscatedName("pe.aj(B)Z")
    public boolean method6820() {
        return this.field4486 != -1;
    }

    @ObfuscatedName("pe.al(Ljava/lang/Object;B)Ljava/lang/Object;")
    public Object method6813(Object arg0) {
        synchronized (this) {
            if (this.field4483 != -1L) {
                this.method6815();
            }
            class396 var3 = (class396) this.field4485.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method6814(var3, false);
                return var3.field4492;
            }
        }
    }

    @ObfuscatedName("pe.ac(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method6826(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4483 != -1L) {
                this.method6815();
            }
            class396 var4 = (class396) this.field4485.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4492;
                var4.field4492 = arg1;
                this.method6814(var4, false);
                return var5;
            }
            if (this.method6820() && this.field4485.size() == this.field4486) {
                class396 var6 = (class396) this.field4482.remove();
                this.field4485.remove(var6.field4490);
                this.field4484.remove(var6);
            }
            class396 var7 = new class396(arg1, arg0);
            this.field4485.put(arg0, var7);
            this.method6814(var7, true);
            return null;
        }
    }

    @ObfuscatedName("pe.ab(Lpn;ZI)V")
    public void method6814(class396 arg0, boolean arg1) {
        if (!arg1) {
            this.field4484.remove(arg0);
            if (this.method6820() && !this.field4482.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4489 = System.currentTimeMillis();
        if (this.method6820()) {
            switch(this.field4487.field4478) {
                case 0:
                    arg0.field4491++;
                    break;
                case 1:
                    arg0.field4491 = arg0.field4489;
            }
            this.field4482.add(arg0);
        }
        this.field4484.add(arg0);
    }

    @ObfuscatedName("pe.an(I)V")
    public void method6815() {
        if (this.field4483 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4483;
        while (!this.field4484.isEmpty()) {
            class396 var3 = (class396) this.field4484.peek();
            if (var3.field4489 >= var1) {
                return;
            }
            this.field4485.remove(var3.field4490);
            this.field4484.remove(var3);
            if (this.method6820()) {
                this.field4482.remove(var3);
            }
        }
    }

    @ObfuscatedName("pe.ao(I)V")
    public void method6816() {
        synchronized (this) {
            this.field4485.clear();
            this.field4484.clear();
            if (this.method6820()) {
                this.field4482.clear();
            }
        }
    }
}
