package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("rw")
public final class class443 {

    @ObfuscatedName("rw.aq")
    public final Comparator field4721;

    @ObfuscatedName("rw.aw")
    public final Map field4719;

    @ObfuscatedName("rw.al")
    public final class412 field4717;

    @ObfuscatedName("rw.ai")
    public final class412 field4718;

    @ObfuscatedName("rw.ar")
    public final long field4715;

    @ObfuscatedName("rw.as")
    public final class441 field4720;

    @ObfuscatedName("rw.aa")
    public final int field4716;

    public class443(int arg0, class441 arg1) {
        this(-1L, arg0, arg1);
    }

    public class443(long arg0, int arg1, class441 arg2) {
        this.field4721 = new class442(this);
        this.field4715 = arg0;
        this.field4716 = arg1;
        this.field4720 = arg2;
        if (this.field4716 == -1) {
            this.field4719 = new HashMap(64);
            this.field4717 = new class412(64, this.field4721);
            this.field4718 = null;
        } else if (this.field4720 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4719 = new HashMap(this.field4716);
            this.field4717 = new class412(this.field4716, this.field4721);
            this.field4718 = new class412(this.field4716);
        }
    }

    @ObfuscatedName("rw.aq(B)Z")
    public boolean method7454() {
        return this.field4716 != -1;
    }

    @ObfuscatedName("rw.aw(Ljava/lang/Object;B)Ljava/lang/Object;")
    public Object method7453(Object arg0) {
        synchronized (this) {
            if (this.field4715 != -1L) {
                this.method7465();
            }
            class444 var3 = (class444) this.field4719.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method7457(var3, false);
                return var3.field4723;
            }
        }
    }

    @ObfuscatedName("rw.al(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7456(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4715 != -1L) {
                this.method7465();
            }
            class444 var4 = (class444) this.field4719.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4723;
                var4.field4723 = arg1;
                this.method7457(var4, false);
                return var5;
            }
            if (this.method7454() && this.field4719.size() == this.field4716) {
                class444 var6 = (class444) this.field4718.remove();
                this.field4719.remove(var6.field4722);
                this.field4717.remove(var6);
            }
            class444 var7 = new class444(arg1, arg0);
            this.field4719.put(arg0, var7);
            this.method7457(var7, true);
            return null;
        }
    }

    @ObfuscatedName("rw.ai(Lrq;ZB)V")
    public void method7457(class444 arg0, boolean arg1) {
        if (!arg1) {
            this.field4717.remove(arg0);
            if (this.method7454() && !this.field4718.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4724 = System.currentTimeMillis();
        if (this.method7454()) {
            switch(this.field4720.field4712) {
                case 0:
                    arg0.field4725 = arg0.field4724;
                    break;
                case 1:
                    arg0.field4725++;
            }
            this.field4718.add(arg0);
        }
        this.field4717.add(arg0);
    }

    @ObfuscatedName("rw.ar(B)V")
    public void method7465() {
        if (this.field4715 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4715;
        while (!this.field4717.isEmpty()) {
            class444 var3 = (class444) this.field4717.peek();
            if (var3.field4724 >= var1) {
                return;
            }
            this.field4719.remove(var3.field4722);
            this.field4717.remove(var3);
            if (this.method7454()) {
                this.field4718.remove(var3);
            }
        }
    }

    @ObfuscatedName("rw.as(I)V")
    public void method7452() {
        synchronized (this) {
            this.field4719.clear();
            this.field4717.clear();
            if (this.method7454()) {
                this.field4718.clear();
            }
        }
    }
}
