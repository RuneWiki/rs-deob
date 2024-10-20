package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("em")
public final class class143 implements Runnable {

    @ObfuscatedName("em.v")
    public InputStream field2186;

    @ObfuscatedName("em.f")
    public OutputStream field2192;

    @ObfuscatedName("em.i")
    public Socket field2187;

    @ObfuscatedName("em.d")
    public boolean field2185 = false;

    @ObfuscatedName("em.o")
    public class136 field2189;

    @ObfuscatedName("em.c")
    public class146 field2190;

    @ObfuscatedName("em.p")
    public byte[] field2191;

    @ObfuscatedName("em.j")
    public int field2193 = 0;

    @ObfuscatedName("em.a")
    public int field2188 = 0;

    @ObfuscatedName("em.y")
    public boolean field2194 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2189 = arg1;
        this.field2187 = arg0;
        this.field2187.setSoTimeout(30000);
        this.field2187.setTcpNoDelay(true);
        this.field2187.setReceiveBufferSize(16384);
        this.field2187.setSendBufferSize(16384);
        this.field2186 = this.field2187.getInputStream();
        this.field2192 = this.field2187.getOutputStream();
    }

    @ObfuscatedName("em.d(B)V")
    public void method2805() {
        if (this.field2185) {
            return;
        }
        synchronized (this) {
            this.field2185 = true;
            this.notifyAll();
        }
        if (this.field2190 != null) {
            while (this.field2190.field2222 == 0) {
                class127.method2134(1L);
            }
            if (this.field2190.field2222 == 1) {
                try {
                    ((Thread) this.field2190.field2226).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2190 = null;
    }

    public void finalize() {
        this.method2805();
    }

    @ObfuscatedName("em.o(I)I")
    public int method2801() throws IOException {
        return this.field2185 ? 0 : this.field2186.read();
    }

    @ObfuscatedName("em.c(B)I")
    public int method2802() throws IOException {
        return this.field2185 ? 0 : this.field2186.available();
    }

    @ObfuscatedName("em.p([BIII)V")
    public void method2803(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2185) {
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

    @ObfuscatedName("em.j([BIIB)V")
    public void method2804(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2185) {
            return;
        }
        if (this.field2194) {
            this.field2194 = false;
            throw new IOException();
        }
        if (this.field2191 == null) {
            this.field2191 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2191[this.field2188] = arg0[arg1 + var5];
                this.field2188 = (this.field2188 + 1) % 5000;
                if ((this.field2193 + 4900) % 5000 == this.field2188) {
                    throw new IOException();
                }
            }
            if (this.field2190 == null) {
                this.field2190 = this.field2189.method2718(this, 3);
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
                        if (this.field2193 == this.field2188) {
                            if (this.field2185) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2193;
                        if (this.field2188 >= this.field2193) {
                            var4 = this.field2188 - this.field2193;
                        } else {
                            var4 = 5000 - this.field2193;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2192.write(this.field2191, var3, var4);
                    } catch (IOException var12) {
                        this.field2194 = true;
                    }
                    this.field2193 = (this.field2193 + var4) % 5000;
                    try {
                        if (this.field2193 == this.field2188) {
                            this.field2192.flush();
                        }
                    } catch (IOException var11) {
                        this.field2194 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2186 != null) {
                        this.field2186.close();
                    }
                    if (this.field2192 != null) {
                        this.field2192.close();
                    }
                    if (this.field2187 != null) {
                        this.field2187.close();
                    }
                } catch (IOException var10) {
                }
                this.field2191 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method1777((String) null, var15);
        }
    }
}
