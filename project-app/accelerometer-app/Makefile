CC ?= gcc
CFLAGS = -Wall -O2
LDFLAGS = 

# Target executable
TARGET = accelerometer-app

# Source files
SRCS = accelerometer-app.c

# Build rules
all: $(TARGET)

$(TARGET): $(SRCS)
	$(CC) $(CFLAGS) $(LDFLAGS) -o $@ $^

# Clean up build artifacts
clean:
	rm -f $(TARGET)

# Install to a directory (optional)
# install: $(TARGET)
# 	install -d $(DESTDIR)/home/root
# 	install -m 0755 $(TARGET) $(DESTDIR)/home/root

.PHONY: all clean install