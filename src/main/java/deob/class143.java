package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ek")
public final class class143 implements Runnable {

    @ObfuscatedName("ek.h")
    public InputStream field2186;

    @ObfuscatedName("ek.m")
    public OutputStream field2183;

    @ObfuscatedName("ek.i")
    public Socket field2179;

    @ObfuscatedName("ek.q")
    public boolean field2180 = false;

    @ObfuscatedName("ek.p")
    public class136 field2177;

    @ObfuscatedName("ek.c")
    public class146 field2182;

    @ObfuscatedName("ek.f")
    public byte[] field2178;

    @ObfuscatedName("ek.y")
    public int field2184 = 0;

    @ObfuscatedName("ek.w")
    public int field2187 = 0;

    @ObfuscatedName("ek.l")
    public boolean field2185 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2177 = arg1;
        this.field2179 = arg0;
        this.field2179.setSoTimeout(30000);
        this.field2179.setTcpNoDelay(true);
        this.field2186 = this.field2179.getInputStream();
        this.field2183 = this.field2179.getOutputStream();
    }

    @ObfuscatedName("ek.i(I)V")
    public void method2802() {
        if (this.field2180) {
            return;
        }
        synchronized (this) {
            this.field2180 = true;
            this.notifyAll();
        }
        if (this.field2182 != null) {
            while (this.field2182.field2215 == 0) {
                class127.method952(1L);
            }
            if (this.field2182.field2215 == 1) {
                try {
                    ((Thread) this.field2182.field2219).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2182 = null;
    }

    public void finalize() {
        this.method2802();
    }

    @ObfuscatedName("ek.q(I)I")
    public int method2805() throws IOException {
        return this.field2180 ? 0 : this.field2186.read();
    }

    @ObfuscatedName("ek.p(B)I")
    public int method2797() throws IOException {
        return this.field2180 ? 0 : this.field2186.available();
    }

    @ObfuscatedName("ek.c([BIII)V")
    public void method2798(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2180) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2186.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ek.f([BIII)V")
    public void method2799(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2180) {
            return;
        }
        if (this.field2185) {
            this.field2185 = false;
            throw new IOException();
        }
        if (this.field2178 == null) {
            this.field2178 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2178[this.field2187] = arg0[arg1 + var5];
                this.field2187 = (this.field2187 + 1) % 5000;
                if ((this.field2184 + 4900) % 5000 == this.field2187) {
                    throw new IOException();
                }
            }
            if (this.field2182 == null) {
                this.field2182 = this.field2177.method2689(this, 3);
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
                        if (this.field2187 == this.field2184) {
                            if (this.field2180) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2184;
                        if (this.field2187 >= this.field2184) {
                            var4 = this.field2187 - this.field2184;
                        } else {
                            var4 = 5000 - this.field2184;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2183.write(this.field2178, var3, var4);
                    } catch (IOException var12) {
                        this.field2185 = true;
                    }
                    this.field2184 = (this.field2184 + var4) % 5000;
                    try {
                        if (this.field2187 == this.field2184) {
                            this.field2183.flush();
                        }
                    } catch (IOException var11) {
                        this.field2185 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2186 != null) {
                        this.field2186.close();
                    }
                    if (this.field2183 != null) {
                        this.field2183.close();
                    }
                    if (this.field2179 != null) {
                        this.field2179.close();
                    }
                } catch (IOException var10) {
                }
                this.field2178 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method2106((String) null, var15);
        }
    }
}
