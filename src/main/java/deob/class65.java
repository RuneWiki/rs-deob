package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bx")
public class class65 extends class52 {

    @ObfuscatedName("bx.e")
    public AudioFormat field1166;

    @ObfuscatedName("bx.a")
    public SourceDataLine field1164;

    @ObfuscatedName("bx.ai")
    public int field1165;

    @ObfuscatedName("bx.aw")
    public byte[] field1163;

    @ObfuscatedName("bx.e(Ljava/awt/Component;)V")
    public void method975(Component arg0) {
        this.field1166 = new AudioFormat((float) Statics.field1064, 16, Statics.field1057 ? 2 : 1, true, false);
        this.field1163 = new byte[0x100 << (Statics.field1057 ? 2 : 1)];
    }

    @ObfuscatedName("bx.a(I)V")
    public void method990(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1166, arg0 << (Statics.field1057 ? 2 : 1));
            this.field1164 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1164.open();
            this.field1164.start();
            this.field1165 = arg0;
        } catch (LineUnavailableException var11) {
            if (class118.method2015(arg0) == 1) {
                this.field1164 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method990(var10);
        }
    }

    @ObfuscatedName("bx.l()I")
    public int method977() {
        return this.field1165 - (this.field1164.available() >> (Statics.field1057 ? 2 : 1));
    }

    @ObfuscatedName("bx.c()V")
    public void method995() {
        int var1 = 256;
        if (Statics.field1057) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1059[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1163[var2 * 2] = (byte) (var3 >> 8);
            this.field1163[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1164.write(this.field1163, 0, var1 << 1);
    }

    @ObfuscatedName("bx.u()V")
    public void method979() {
        if (this.field1164 != null) {
            this.field1164.close();
            this.field1164 = null;
        }
    }

    @ObfuscatedName("bx.w()V")
    public void method976() {
        this.field1164.flush();
    }
}
