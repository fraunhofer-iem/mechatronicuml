FROM debian:sid-slim

ENV VERSION 5.2.3
ENV NDDSHOME /y/rti_connext_dds-${VERSION}/
ENV CMOCKA cmocka-1.0.1

ADD http://s3.amazonaws.com/RTI/Bundles/5.2.3/Evaluation/rti_connext_dds-${VERSION}-eval-x64Linux3gcc4.8.2.run /opt/dds/

RUN  chmod +x /opt/dds/rti_connext_dds-${VERSION}-eval-x64Linux3gcc4.8.2.run  \
  && apt-get update && apt-get install -y build-essential libcurl4-gnutls-dev curl sqlite3 git binutils wget cmake pkg-config valgrind gcovr \
  && groupadd -r app && useradd -r -m -g app app \
  && yes | /opt/dds/rti_connext_dds-${VERSION}-eval-x64Linux3gcc4.8.2.run \
  && apt-get autoremove -y && apt-get clean \
  && rm -rf /var/lib/apt/lists/*

ADD rti_license.dat /y/rti_connext_dds-${VERSION}/


