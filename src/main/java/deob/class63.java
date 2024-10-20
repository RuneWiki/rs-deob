package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bi")
public class class63 extends class50 {

    @ObfuscatedName("bi.i")
    public AudioFormat field1192;

    @ObfuscatedName("bi.c")
    public SourceDataLine field1193;

    @ObfuscatedName("bi.ag")
    public int field1194;

    @ObfuscatedName("bi.aj")
    public byte[] field1195;

    @ObfuscatedName("bi.i(Ljava/awt/Component;)V")
    public void method939(Component arg0) {
        this.field1192 = new AudioFormat((float) Statics.field1095, 16, Statics.field1082 ? 2 : 1, true, false);
        this.field1195 = new byte[0x100 << (Statics.field1082 ? 2 : 1)];
    }

    @ObfuscatedName("bi.c(I)V")
    public void method937(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1192, arg0 << (Statics.field1082 ? 2 : 1));
            this.field1193 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1193.open();
            this.field1193.start();
            this.field1194 = arg0;
        } catch (LineUnavailableException var11) {
            if (class113.method2086(arg0) == 1) {
                this.field1193 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method937(var10);
        }
    }

    @ObfuscatedName("bi.h()I")
    public int method934() {
        return this.field1194 - (this.field1193.available() >> (Statics.field1082 ? 2 : 1));
    }

    @ObfuscatedName("bi.v()V")
    public void method935() {
        int var1 = 256;
        if (Statics.field1082) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1086[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1195[var2 * 2] = (byte) (var3 >> 8);
            this.field1195[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1193.write(this.field1195, 0, var1 << 1);
    }

    @ObfuscatedName("bi.q()V")
    public void method940() {
        if (this.field1193 != null) {
            this.field1193.close();
            this.field1193 = null;
        }
    }

    @ObfuscatedName("bi.s()V")
    public void method945() {
        this.field1193.flush();
    }
}
