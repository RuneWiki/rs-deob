package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bh")
public class class63 extends class50 {

    @ObfuscatedName("bh.z")
    public AudioFormat field1152;

    @ObfuscatedName("bh.j")
    public SourceDataLine field1153;

    @ObfuscatedName("bh.af")
    public int field1154;

    @ObfuscatedName("bh.ad")
    public byte[] field1155;

    @ObfuscatedName("bh.z(Ljava/awt/Component;)V")
    public void method912(Component arg0) {
        this.field1152 = new AudioFormat((float) Statics.field1044, 16, Statics.field1042 ? 2 : 1, true, false);
        this.field1155 = new byte[0x100 << (Statics.field1042 ? 2 : 1)];
    }

    @ObfuscatedName("bh.j(I)V")
    public void method913(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1152, arg0 << (Statics.field1042 ? 2 : 1));
            this.field1153 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1153.open();
            this.field1153.start();
            this.field1154 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1153 = null;
                throw var11;
            } else {
                this.method913(class113.method2884(arg0));
            }
        }
    }

    @ObfuscatedName("bh.a()I")
    public int method914() {
        return this.field1154 - (this.field1153.available() >> (Statics.field1042 ? 2 : 1));
    }

    @ObfuscatedName("bh.y()V")
    public void method915() {
        int var1 = 256;
        if (Statics.field1042) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1055[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1155[var2 * 2] = (byte) (var3 >> 8);
            this.field1155[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1153.write(this.field1155, 0, var1 << 1);
    }

    @ObfuscatedName("bh.i()V")
    public void method911() {
        if (this.field1153 != null) {
            this.field1153.close();
            this.field1153 = null;
        }
    }

    @ObfuscatedName("bh.b()V")
    public void method917() {
        this.field1153.flush();
    }
}
