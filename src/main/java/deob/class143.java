package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eq")
public final class class143 implements Runnable {

    @ObfuscatedName("eq.m")
    public InputStream field2156;

    @ObfuscatedName("eq.l")
    public OutputStream field2158;

    @ObfuscatedName("eq.y")
    public Socket field2152;

    @ObfuscatedName("eq.u")
    public boolean field2159 = false;

    @ObfuscatedName("eq.k")
    public class136 field2154;

    @ObfuscatedName("eq.j")
    public class146 field2155;

    @ObfuscatedName("eq.i")
    public byte[] field2157;

    @ObfuscatedName("eq.x")
    public int field2153 = 0;

    @ObfuscatedName("eq.g")
    public int field2151 = 0;

    @ObfuscatedName("eq.e")
    public boolean field2150 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2154 = arg1;
        this.field2152 = arg0;
        this.field2152.setSoTimeout(30000);
        this.field2152.setTcpNoDelay(true);
        this.field2156 = this.field2152.getInputStream();
        this.field2158 = this.field2152.getOutputStream();
    }

    @ObfuscatedName("eq.k(B)V")
    public void method2883() {
        if (this.field2159) {
            return;
        }
        synchronized (this) {
            this.field2159 = true;
            this.notifyAll();
        }
        if (this.field2155 != null) {
            while (this.field2155.field2191 == 0) {
                class127.method3199(1L);
            }
            if (this.field2155.field2191 == 1) {
                try {
                    ((Thread) this.field2155.field2183).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2155 = null;
    }

    public void finalize() {
        this.method2883();
    }

    @ObfuscatedName("eq.j(I)I")
    public int method2876() throws IOException {
        return this.field2159 ? 0 : this.field2156.read();
    }

    @ObfuscatedName("eq.i(B)I")
    public int method2867() throws IOException {
        return this.field2159 ? 0 : this.field2156.available();
    }

    @ObfuscatedName("eq.x([BIIB)V")
    public void method2868(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2159) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2156.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("eq.g([BIII)V")
    public void method2866(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2159) {
            return;
        }
        if (this.field2150) {
            this.field2150 = false;
            throw new IOException();
        }
        if (this.field2157 == null) {
            this.field2157 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2157[this.field2151] = arg0[arg1 + var5];
                this.field2151 = (this.field2151 + 1) % 5000;
                if ((this.field2153 + 4900) % 5000 == this.field2151) {
                    throw new IOException();
                }
            }
            if (this.field2155 == null) {
                this.field2155 = this.field2154.method2756(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2153 == this.field2151) {
                            if (this.field2159) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2153;
                        if (this.field2151 >= this.field2153) {
                            var4 = this.field2151 - this.field2153;
                        } else {
                            var4 = 5000 - this.field2153;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2158.write(this.field2157, var3, var4);
                    } catch (IOException var12) {
                        this.field2150 = true;
                    }
                    this.field2153 = (this.field2153 + var4) % 5000;
                    try {
                        if (this.field2153 == this.field2151) {
                            this.field2158.flush();
                        }
                    } catch (IOException var11) {
                        this.field2150 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2156 != null) {
                        this.field2156.close();
                    }
                    if (this.field2158 != null) {
                        this.field2158.close();
                    }
                    if (this.field2152 != null) {
                        this.field2152.close();
                    }
                } catch (IOException var10) {
                }
                this.field2157 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method1554((String) null, var15);
        }
    }
}
