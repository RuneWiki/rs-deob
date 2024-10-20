package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("h")
public class class19 {

    @ObfuscatedName("h.d")
    public int field266;

    @ObfuscatedName("h.p")
    public class146 field267;

    @ObfuscatedName("h.v")
    public DataInputStream field260;

    @ObfuscatedName("h.l")
    public byte[] field261 = new byte[4];

    @ObfuscatedName("h.y")
    public int field258;

    @ObfuscatedName("h.w")
    public byte[] field259;

    @ObfuscatedName("h.u")
    public int field264;

    @ObfuscatedName("h.a")
    public long field263;

    public class19(class136 arg0, URL arg1) {
        this.field267 = arg0.method2747(arg1);
        this.field266 = 0;
        this.field263 = class115.method2142() + 30000L;
    }

    @ObfuscatedName("h.d(B)[B")
    public byte[] method196() throws IOException {
        if (class115.method2142() > this.field263) {
            throw new IOException();
        }
        if (this.field266 == 0) {
            if (this.field267.field2192 == 2) {
                throw new IOException();
            }
            if (this.field267.field2192 == 1) {
                this.field260 = (DataInputStream) this.field267.field2195;
                this.field266 = 1;
            }
        }
        if (this.field266 == 1) {
            int var1 = this.field260.available();
            if (var1 > 0) {
                if (this.field258 + var1 > 4) {
                    var1 = 4 - this.field258;
                }
                this.field258 += this.field260.read(this.field261, this.field258, var1);
                if (this.field258 == 4) {
                    int var2 = (new class119(this.field261)).method2362();
                    this.field259 = new byte[var2];
                    this.field266 = 2;
                }
            }
        }
        if (this.field266 == 2) {
            int var3 = this.field260.available();
            if (var3 > 0) {
                if (this.field264 + var3 > this.field259.length) {
                    var3 = this.field259.length - this.field264;
                }
                this.field264 += this.field260.read(this.field259, this.field264, var3);
                if (this.field264 == this.field259.length) {
                    return this.field259;
                }
            }
        }
        return null;
    }
}
