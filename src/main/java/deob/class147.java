package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ew")
public final class class147 implements Runnable {

    @ObfuscatedName("ew.e")
    public InputStream field2230;

    @ObfuscatedName("ew.l")
    public OutputStream field2227;

    @ObfuscatedName("ew.c")
    public Socket field2228;

    @ObfuscatedName("ew.h")
    public boolean field2229 = false;

    @ObfuscatedName("ew.r")
    public class140 field2233;

    @ObfuscatedName("ew.a")
    public class150 field2231;

    @ObfuscatedName("ew.b")
    public byte[] field2232;

    @ObfuscatedName("ew.u")
    public int field2226 = 0;

    @ObfuscatedName("ew.o")
    public int field2236 = 0;

    @ObfuscatedName("ew.p")
    public boolean field2235 = false;

    public class147(Socket arg0, class140 arg1) throws IOException {
        this.field2233 = arg1;
        this.field2228 = arg0;
        this.field2228.setSoTimeout(30000);
        this.field2228.setTcpNoDelay(true);
        this.field2228.setReceiveBufferSize(16384);
        this.field2228.setSendBufferSize(16384);
        this.field2230 = this.field2228.getInputStream();
        this.field2227 = this.field2228.getOutputStream();
    }

    @ObfuscatedName("ew.r(I)V")
    public void method2929() {
        if (this.field2229) {
            return;
        }
        synchronized (this) {
            this.field2229 = true;
            this.notifyAll();
        }
        if (this.field2231 != null) {
            while (this.field2231.field2265 == 0) {
                class131.method2735(1L);
            }
            if (this.field2231.field2265 == 1) {
                try {
                    ((Thread) this.field2231.field2261).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2231 = null;
    }

    public void finalize() {
        this.method2929();
    }

    @ObfuscatedName("ew.a(B)I")
    public int method2921() throws IOException {
        return this.field2229 ? 0 : this.field2230.read();
    }

    @ObfuscatedName("ew.b(I)I")
    public int method2922() throws IOException {
        return this.field2229 ? 0 : this.field2230.available();
    }

    @ObfuscatedName("ew.u([BIII)V")
    public void method2923(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2229) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2230.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ew.o([BIII)V")
    public void method2924(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2229) {
            return;
        }
        if (this.field2235) {
            this.field2235 = false;
            throw new IOException();
        }
        if (this.field2232 == null) {
            this.field2232 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2232[this.field2236] = arg0[arg1 + var5];
                this.field2236 = (this.field2236 + 1) % 5000;
                if ((this.field2226 + 4900) % 5000 == this.field2236) {
                    throw new IOException();
                }
            }
            if (this.field2231 == null) {
                this.field2231 = this.field2233.method2852(this, 3);
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
                        if (this.field2236 == this.field2226) {
                            if (this.field2229) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2226;
                        if (this.field2236 >= this.field2226) {
                            var4 = this.field2236 - this.field2226;
                        } else {
                            var4 = 5000 - this.field2226;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2227.write(this.field2232, var3, var4);
                    } catch (IOException var12) {
                        this.field2235 = true;
                    }
                    this.field2226 = (this.field2226 + var4) % 5000;
                    try {
                        if (this.field2236 == this.field2226) {
                            this.field2227.flush();
                        }
                    } catch (IOException var11) {
                        this.field2235 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2230 != null) {
                        this.field2230.close();
                    }
                    if (this.field2227 != null) {
                        this.field2227.close();
                    }
                    if (this.field2228 != null) {
                        this.field2228.close();
                    }
                } catch (IOException var10) {
                }
                this.field2232 = null;
                break;
            }
        } catch (Exception var15) {
            class152.method976((String) null, var15);
        }
    }
}
