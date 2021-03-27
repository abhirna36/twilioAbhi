/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React, {useState} from 'react';

import type {Node} from 'react';
import {
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  useColorScheme,
  View,
  Button,
  NativeModules,
} from 'react-native';

import {
  Colors,
  DebugInstructions,
  Header,
  LearnMoreLinks,
  ReloadInstructions,
} from 'react-native/Libraries/NewAppScreen';

import {WebView} from 'react-native-webview';
import Modal from 'react-native-modal';

const Section = ({children, title}): Node => {
  const isDarkMode = useColorScheme() === 'dark';
  return (
    <View style={styles.sectionContainer}>
      <Text
        style={[
          styles.sectionTitle,
          {
            color: isDarkMode ? Colors.white : Colors.black,
          },
        ]}>
        {title}
      </Text>
      <Text
        style={[
          styles.sectionDescription,
          {
            color: isDarkMode ? Colors.light : Colors.dark,
          },
        ]}>
        {children}
      </Text>
    </View>
  );
};

const App: () => Node = () => {
  const isDarkMode = useColorScheme() === 'dark';
  console.log(NativeModules.WHSwiftClass);
  const backgroundStyle = {
    backgroundColor: isDarkMode ? Colors.darker : Colors.lighter,
  };

  const toggleModal = () => {
    setModalVisible(!isModalVisible);
  };

  const [isModalVisible, setModalVisible] = useState(false);

  return (
    // <WebView
    //   source={{
    //     uri:
    //       'https://main-ui-next-git-unified-develop-mweb-math.whjr.dev/s/login',
    //   }}
    //   style={{marginTop: 20}}

    // />

    <Button
      title={'Open Twilio'}
      style={{width: 200, height: 50, backgroundColor: 'blue'}}
      onPress={() => {
        console.log('abc');
        NativeModules.TWILIO.initTwilio('testing1');
      }}
    />

    //   // <SafeAreaView style={backgroundStyle}>
    //   //   <StatusBar barStyle={isDarkMode ? 'light-content' : 'dark-content'} />
    //     {/* <Button title= {"Open Twillio"} style={{width:200, height:50, backgroundColor:'blue'}} onPress = {()=>{
    //        NativeModules.WHSwiftClass.printMeNow("I am printing this", value=>{
    //          debugger
    //          console.log("Call back came", value)
    //        })
    //     }}>
    //     </Button>

    //     <Button title= {"Open WebView"} style={{width:200, height:50, backgroundColor:'blue'}} onPress = {toggleModal}>

    // </Button>

    //         <Modal isVisible={isModalVisible}>
    //         <View style={{flex: 1, backgroundColor:'white'}}>
    //           <Text>Hello!</Text>

    //           <Button title="Hide modal" onPress={toggleModal} />
    //           <WebView
    //               source={{ uri: 'https://main-ui-next-git-unified-develop-mweb-math.whjr.dev/s/completed-class' }}
    //               style={{ marginTop: 20 }}
    //             />
    //         </View>
    //       </Modal> */}

    //   // </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  sectionContainer: {
    marginTop: 32,
    paddingHorizontal: 24,
  },
  sectionTitle: {
    fontSize: 24,
    fontWeight: '600',
  },
  sectionDescription: {
    marginTop: 8,
    fontSize: 18,
    fontWeight: '400',
  },
  highlight: {
    fontWeight: '700',
  },
});

export default App;
