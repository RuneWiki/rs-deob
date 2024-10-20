package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ao")
public class class175 extends class186 {

    @ObfuscatedName("ao.o")
    public int field2636;

    @ObfuscatedName("ao.j")
    public AudioFormat field2633;

    @ObfuscatedName("ao.t")
    public byte[] field2635;

    @ObfuscatedName("ao.p")
    public SourceDataLine field2634;

    @ObfuscatedName("ao.j(Ljava/awt/Component;)V")
    public void method3330(Component arg0) {
        this.field2633 = new AudioFormat((float) Statics.field2851, 16, Statics.field2866 ? 2 : 1, true, false);
        this.field2635 = new byte[0x100 << (Statics.field2866 ? 2 : 1)];
    }

    @ObfuscatedName("ao.p(I)V")
    public void method3314(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field2633, arg0 << (Statics.field2866 ? 2 : 1));
            this.field2634 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2634.open();
            this.field2634.start();
            this.field2636 = arg0;
        } catch (LineUnavailableException var11) {
            if (Statics.method1331(arg0) == 1) {
                this.field2634 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method3314(var10);
        }
    }

    @ObfuscatedName("ao.h()V")
    public void method3317() {
        if (this.field2634 != null) {
            this.field2634.close();
            this.field2634 = null;
        }
    }

    @ObfuscatedName("ao.r()V")
    public void method3318() {
        this.field2634.flush();
    }

    @ObfuscatedName("ao.o()I")
    public int method3315() {
        return this.field2636 - (this.field2634.available() >> (Statics.field2866 ? 2 : 1));
    }

    @ObfuscatedName("ao.t()V")
    public void method3316() {
        int var1 = 256;
        if (Statics.field2866) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2847[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field2635[var2 * 2] = (byte) (var3 >> 8);
            this.field2635[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2634.write(this.field2635, 0, var1 << 1);
    }
}
