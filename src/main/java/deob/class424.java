package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("qv")
public final class class424 {

    @ObfuscatedName("qv.au")
    public final Comparator field4620;

    @ObfuscatedName("qv.ae")
    public final Map field4614;

    @ObfuscatedName("qv.ao")
    public final class393 field4615;

    @ObfuscatedName("qv.at")
    public final class393 field4616;

    @ObfuscatedName("qv.ac")
    public final long field4617;

    @ObfuscatedName("qv.ai")
    public final class422 field4618;

    @ObfuscatedName("qv.az")
    public final int field4619;

    public class424(int arg0, class422 arg1) {
        this(-1L, arg0, arg1);
    }

    public class424(long arg0, int arg1, class422 arg2) {
        this.field4620 = new class423(this);
        this.field4617 = arg0;
        this.field4619 = arg1;
        this.field4618 = arg2;
        if (this.field4619 == -1) {
            this.field4614 = new HashMap(64);
            this.field4615 = new class393(64, this.field4620);
            this.field4616 = null;
        } else if (this.field4618 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4614 = new HashMap(this.field4619);
            this.field4615 = new class393(this.field4619, this.field4620);
            this.field4616 = new class393(this.field4619);
        }
    }

    @ObfuscatedName("qv.au(I)Z")
    public boolean method7159() {
        return this.field4619 != -1;
    }

    @ObfuscatedName("qv.ae(Ljava/lang/Object;B)Ljava/lang/Object;")
    public Object method7160(Object arg0) {
        synchronized (this) {
            if (this.field4617 != -1L) {
                this.method7162();
            }
            class425 var3 = (class425) this.field4614.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method7163(var3, false);
                return var3.field4621;
            }
        }
    }

    @ObfuscatedName("qv.ao(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7161(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4617 != -1L) {
                this.method7162();
            }
            class425 var4 = (class425) this.field4614.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4621;
                var4.field4621 = arg1;
                this.method7163(var4, false);
                return var5;
            }
            if (this.method7159() && this.field4614.size() == this.field4619) {
                class425 var6 = (class425) this.field4616.remove();
                this.field4614.remove(var6.field4622);
                this.field4615.remove(var6);
            }
            class425 var7 = new class425(arg1, arg0);
            this.field4614.put(arg0, var7);
            this.method7163(var7, true);
            return null;
        }
    }

    @ObfuscatedName("qv.at(Lqj;ZB)V")
    public void method7163(class425 arg0, boolean arg1) {
        if (!arg1) {
            this.field4615.remove(arg0);
            if (this.method7159() && !this.field4616.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4623 = System.currentTimeMillis();
        if (this.method7159()) {
            switch(this.field4618.field4608) {
                case 0:
                    arg0.field4624 = arg0.field4623;
                    break;
                case 1:
                    arg0.field4624++;
            }
            this.field4616.add(arg0);
        }
        this.field4615.add(arg0);
    }

    @ObfuscatedName("qv.ac(I)V")
    public void method7162() {
        if (this.field4617 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4617;
        while (!this.field4615.isEmpty()) {
            class425 var3 = (class425) this.field4615.peek();
            if (var3.field4623 >= var1) {
                return;
            }
            this.field4614.remove(var3.field4622);
            this.field4615.remove(var3);
            if (this.method7159()) {
                this.field4616.remove(var3);
            }
        }
    }

    @ObfuscatedName("qv.ai(B)V")
    public void method7158() {
        synchronized (this) {
            this.field4614.clear();
            this.field4615.clear();
            if (this.method7159()) {
                this.field4616.clear();
            }
        }
    }
}
