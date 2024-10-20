package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("s")
public class class19 {

    @ObfuscatedName("s.o")
    public int field272;

    @ObfuscatedName("s.f")
    public class146 field261;

    @ObfuscatedName("s.i")
    public byte[] field263 = new byte[4];

    @ObfuscatedName("s.h")
    public DataInputStream field270;

    @ObfuscatedName("s.q")
    public int field265;

    @ObfuscatedName("s.u")
    public byte[] field268;

    @ObfuscatedName("s.m")
    public int field266;

    @ObfuscatedName("s.y")
    public long field267;

    public class19(class136 arg0, URL arg1) {
        this.field261 = arg0.method2665(arg1);
        this.field272 = 0;
        this.field267 = class115.method568() + 30000L;
    }

    @ObfuscatedName("s.o(I)[B")
    public byte[] method179() throws IOException {
        if (class115.method568() > this.field267) {
            throw new IOException();
        }
        if (this.field272 == 0) {
            if (this.field261.field2204 == 2) {
                throw new IOException();
            }
            if (this.field261.field2204 == 1) {
                this.field270 = (DataInputStream) this.field261.field2200;
                this.field272 = 1;
            }
        }
        if (this.field272 == 1) {
            int var1 = this.field270.available();
            if (var1 > 0) {
                if (this.field265 + var1 > 4) {
                    var1 = 4 - this.field265;
                }
                this.field265 += this.field270.read(this.field263, this.field265, var1);
                if (this.field265 == 4) {
                    int var2 = (new class119(this.field263)).method2295();
                    this.field268 = new byte[var2];
                    this.field272 = 2;
                }
            }
        }
        if (this.field272 == 2) {
            int var3 = this.field270.available();
            if (var3 > 0) {
                if (this.field266 + var3 > this.field268.length) {
                    var3 = this.field268.length - this.field266;
                }
                this.field266 += this.field270.read(this.field268, this.field266, var3);
                if (this.field266 == this.field268.length) {
                    return this.field268;
                }
            }
        }
        return null;
    }
}
