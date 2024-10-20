package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kv")
public class class261 extends class240 {

    @ObfuscatedName("kv.ax")
    public HashSet field2680;

    @ObfuscatedName("kv.aw")
    public HashSet field2678;

    @ObfuscatedName("kv.az")
    public List field2679;

    @ObfuscatedName("kv.dd(Luk;Luk;IZI)V")
    public void method4609(class531 arg0, class531 arg1, int arg2, boolean arg3) {
        this.method4265(arg0, arg2);
        int var5 = arg1.method8775();
        this.field2680 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class235 var7 = new class235();
            try {
                var7.method4203(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2680.add(var7);
        }
        int var9 = arg1.method8775();
        this.field2678 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class243 var11 = new class243();
            try {
                var11.method4506(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2678.add(var11);
        }
        this.method4604(arg1, arg3);
    }

    @ObfuscatedName("kv.dc(Luk;ZB)V")
    public void method4604(class531 arg0, boolean arg1) {
        this.field2679 = new LinkedList();
        int var3 = arg0.method8775();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method8721();
            class337 var6 = new class337(arg0.method8566());
            boolean var7 = arg0.method8561() == 1;
            if (arg1 || !var7) {
                this.field2679.add(new class246((class337) null, var6, var5, (class253) null));
            }
        }
    }
}
