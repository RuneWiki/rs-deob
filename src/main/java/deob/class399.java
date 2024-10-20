package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("pk")
public final class class399 {

    @ObfuscatedName("pk.af")
    public final Comparator field4538;

    @ObfuscatedName("pk.an")
    public final Map field4537;

    @ObfuscatedName("pk.aw")
    public final class378 field4541;

    @ObfuscatedName("pk.ac")
    public final class378 field4536;

    @ObfuscatedName("pk.au")
    public final long field4539;

    @ObfuscatedName("pk.ab")
    public final class397 field4540;

    @ObfuscatedName("pk.aq")
    public final int field4542;

    public class399(int arg0, class397 arg1) {
        this(-1L, arg0, arg1);
    }

    public class399(long arg0, int arg1, class397 arg2) {
        this.field4538 = new class398(this);
        this.field4539 = arg0;
        this.field4542 = arg1;
        this.field4540 = arg2;
        if (this.field4542 == -1) {
            this.field4537 = new HashMap(64);
            this.field4541 = new class378(64, this.field4538);
            this.field4536 = null;
        } else if (this.field4540 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4537 = new HashMap(this.field4542);
            this.field4541 = new class378(this.field4542, this.field4538);
            this.field4536 = new class378(this.field4542);
        }
    }

    @ObfuscatedName("pk.af(B)Z")
    public boolean method7047() {
        return this.field4542 != -1;
    }

    @ObfuscatedName("pk.an(Ljava/lang/Object;S)Ljava/lang/Object;")
    public Object method7068(Object arg0) {
        synchronized (this) {
            if (this.field4539 != -1L) {
                this.method7052();
            }
            class400 var3 = (class400) this.field4537.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method7050(var3, false);
                return var3.field4543;
            }
        }
    }

    @ObfuscatedName("pk.aw(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7049(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4539 != -1L) {
                this.method7052();
            }
            class400 var4 = (class400) this.field4537.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4543;
                var4.field4543 = arg1;
                this.method7050(var4, false);
                return var5;
            }
            if (this.method7047() && this.field4537.size() == this.field4542) {
                class400 var6 = (class400) this.field4536.remove();
                this.field4537.remove(var6.field4544);
                this.field4541.remove(var6);
            }
            class400 var7 = new class400(arg1, arg0);
            this.field4537.put(arg0, var7);
            this.method7050(var7, true);
            return null;
        }
    }

    @ObfuscatedName("pk.ac(Lpj;ZB)V")
    public void method7050(class400 arg0, boolean arg1) {
        if (!arg1) {
            this.field4541.remove(arg0);
            if (this.method7047() && !this.field4536.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4545 = System.currentTimeMillis();
        if (this.method7047()) {
            switch(this.field4540.field4532) {
                case 0:
                    arg0.field4546++;
                    break;
                case 1:
                    arg0.field4546 = arg0.field4545;
            }
            this.field4536.add(arg0);
        }
        this.field4541.add(arg0);
    }

    @ObfuscatedName("pk.au(B)V")
    public void method7052() {
        if (this.field4539 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4539;
        while (!this.field4541.isEmpty()) {
            class400 var3 = (class400) this.field4541.peek();
            if (var3.field4545 >= var1) {
                return;
            }
            this.field4537.remove(var3.field4544);
            this.field4541.remove(var3);
            if (this.method7047()) {
                this.field4536.remove(var3);
            }
        }
    }

    @ObfuscatedName("pk.ab(I)V")
    public void method7069() {
        synchronized (this) {
            this.field4537.clear();
            this.field4541.clear();
            if (this.method7047()) {
                this.field4536.clear();
            }
        }
    }
}
