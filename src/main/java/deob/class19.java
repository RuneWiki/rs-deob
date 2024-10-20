package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("r")
public class class19 {

    @ObfuscatedName("r.h")
    public int field271;

    @ObfuscatedName("r.q")
    public class146 field266;

    @ObfuscatedName("r.v")
    public DataInputStream field268;

    @ObfuscatedName("r.n")
    public byte[] field269 = new byte[4];

    @ObfuscatedName("r.f")
    public int field270;

    @ObfuscatedName("r.g")
    public byte[] field267;

    @ObfuscatedName("r.o")
    public int field272;

    @ObfuscatedName("r.s")
    public long field273;

    public class19(class136 arg0, URL arg1) {
        this.field266 = arg0.method2764(arg1);
        this.field271 = 0;
        this.field273 = class115.method2082() + 30000L;
    }

    @ObfuscatedName("r.h(I)[B")
    public byte[] method195() throws IOException {
        if (class115.method2082() > this.field273) {
            throw new IOException();
        }
        if (this.field271 == 0) {
            if (this.field266.field2200 == 2) {
                throw new IOException();
            }
            if (this.field266.field2200 == 1) {
                this.field268 = (DataInputStream) this.field266.field2204;
                this.field271 = 1;
            }
        }
        if (this.field271 == 1) {
            int var1 = this.field268.available();
            if (var1 > 0) {
                if (this.field270 + var1 > 4) {
                    var1 = 4 - this.field270;
                }
                this.field270 += this.field268.read(this.field269, this.field270, var1);
                if (this.field270 == 4) {
                    int var2 = (new class119(this.field269)).method2388();
                    this.field267 = new byte[var2];
                    this.field271 = 2;
                }
            }
        }
        if (this.field271 == 2) {
            int var3 = this.field268.available();
            if (var3 > 0) {
                if (this.field272 + var3 > this.field267.length) {
                    var3 = this.field267.length - this.field272;
                }
                this.field272 += this.field268.read(this.field267, this.field272, var3);
                if (this.field272 == this.field267.length) {
                    return this.field267;
                }
            }
        }
        return null;
    }
}
