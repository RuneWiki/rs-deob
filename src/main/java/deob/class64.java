package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bz")
public class class64 extends class51 {

    @ObfuscatedName("bz.b")
    public AudioFormat field1188;

    @ObfuscatedName("bz.e")
    public SourceDataLine field1187;

    @ObfuscatedName("bz.ai")
    public int field1186;

    @ObfuscatedName("bz.aa")
    public byte[] field1189;

    @ObfuscatedName("bz.b(Ljava/awt/Component;)V")
    public void method932(Component arg0) {
        this.field1188 = new AudioFormat((float) Statics.field1092, 16, Statics.field1077 ? 2 : 1, true, false);
        this.field1189 = new byte[0x100 << (Statics.field1077 ? 2 : 1)];
    }

    @ObfuscatedName("bz.e(I)V")
    public void method928(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1188, arg0 << (Statics.field1077 ? 2 : 1));
            this.field1187 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1187.open();
            this.field1187.start();
            this.field1186 = arg0;
        } catch (LineUnavailableException var11) {
            if (class117.method464(arg0) == 1) {
                this.field1187 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method928(var10);
        }
    }

    @ObfuscatedName("bz.i()I")
    public int method919() {
        return this.field1186 - (this.field1187.available() >> (Statics.field1077 ? 2 : 1));
    }

    @ObfuscatedName("bz.k()V")
    public void method922() {
        int var1 = 256;
        if (Statics.field1077) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1081[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1189[var2 * 2] = (byte) (var3 >> 8);
            this.field1189[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1187.write(this.field1189, 0, var1 << 1);
    }

    @ObfuscatedName("bz.h()V")
    public void method921() {
        if (this.field1187 != null) {
            this.field1187.close();
            this.field1187 = null;
        }
    }

    @ObfuscatedName("bz.p()V")
    public void method925() {
        this.field1187.flush();
    }
}
