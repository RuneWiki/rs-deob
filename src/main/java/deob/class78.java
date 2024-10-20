package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("by")
public class class78 {

    @ObfuscatedName("by.a")
    public int field1211;

    @ObfuscatedName("by.j")
    public class154 field1205;

    @ObfuscatedName("by.n")
    public DataInputStream field1207;

    @ObfuscatedName("by.r")
    public byte[] field1208 = new byte[4];

    @ObfuscatedName("by.v")
    public int field1212;

    @ObfuscatedName("by.e")
    public byte[] field1210;

    @ObfuscatedName("by.l")
    public int field1206;

    @ObfuscatedName("by.s")
    public long field1209;

    public class78(class155 arg0, URL arg1) {
        this.field1205 = arg0.method2679(arg1);
        this.field1211 = 0;
        this.field1209 = class176.method584() + 30000L;
    }

    @ObfuscatedName("by.a(I)[B")
    public byte[] method1341() throws IOException {
        if (class176.method584() > this.field1209) {
            throw new IOException();
        }
        if (this.field1211 == 0) {
            if (this.field1205.field2221 == 2) {
                throw new IOException();
            }
            if (this.field1205.field2221 == 1) {
                this.field1207 = (DataInputStream) this.field1205.field2225;
                this.field1211 = 1;
            }
        }
        if (this.field1211 == 1) {
            this.field1212 += this.field1207.read(this.field1208, this.field1212, this.field1208.length - this.field1212);
            if (this.field1212 == 4) {
                int var1 = (new class174(this.field1208)).method2876();
                this.field1210 = new byte[var1];
                this.field1211 = 2;
            }
        }
        if (this.field1211 == 2) {
            this.field1206 += this.field1207.read(this.field1210, this.field1206, this.field1210.length - this.field1206);
            if (this.field1206 == this.field1210.length) {
                return this.field1210;
            }
        }
        return null;
    }
}
