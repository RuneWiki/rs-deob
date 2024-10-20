package deob;

import java.util.Comparator;

@ObfuscatedName("bq")
public class class60 implements Comparator {

    @ObfuscatedName("bq.c")
    public boolean field469;

    @ObfuscatedName("bq.c(Llj;Llj;B)I")
    public int method1020(class323 arg0, class323 arg1) {
        if (arg0.field4062 == arg1.field4062) {
            return 0;
        }
        if (this.field469) {
            if (client.field697 == arg0.field4062) {
                return -1;
            }
            if (client.field697 == arg1.field4062) {
                return 1;
            }
        }
        return arg0.field4062 < arg1.field4062 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1020((class323) arg0, (class323) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
