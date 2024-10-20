package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bs")
public class class63 extends class50 {

    @ObfuscatedName("bs.g")
    public AudioFormat field1179;

    @ObfuscatedName("bs.v")
    public SourceDataLine field1178;

    @ObfuscatedName("bs.as")
    public int field1177;

    @ObfuscatedName("bs.aa")
    public byte[] field1180;

    @ObfuscatedName("bs.g(Ljava/awt/Component;)V")
    public void method950(Component arg0) {
        this.field1179 = new AudioFormat((float) Statics.field1074, 16, Statics.field1079 ? 2 : 1, true, false);
        this.field1180 = new byte[0x100 << (Statics.field1079 ? 2 : 1)];
    }

    @ObfuscatedName("bs.v(I)V")
    public void method951(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1179, arg0 << (Statics.field1079 ? 2 : 1));
            this.field1178 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1178.open();
            this.field1178.start();
            this.field1177 = arg0;
        } catch (LineUnavailableException var11) {
            if (class113.method1621(arg0) == 1) {
                this.field1178 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method951(var10);
        }
    }

    @ObfuscatedName("bs.z()I")
    public int method952() {
        return this.field1177 - (this.field1178.available() >> (Statics.field1079 ? 2 : 1));
    }

    @ObfuscatedName("bs.h()V")
    public void method949() {
        int var1 = 256;
        if (Statics.field1079) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1089[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1180[var2 * 2] = (byte) (var3 >> 8);
            this.field1180[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1178.write(this.field1180, 0, var1 << 1);
    }

    @ObfuscatedName("bs.k()V")
    public void method954() {
        if (this.field1178 != null) {
            this.field1178.close();
            this.field1178 = null;
        }
    }

    @ObfuscatedName("bs.l()V")
    public void method956() {
        this.field1178.flush();
    }
}
